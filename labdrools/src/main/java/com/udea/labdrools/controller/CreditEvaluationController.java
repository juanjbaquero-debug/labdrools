package com.udea.labdrools.controller;

import com.udea.labdrools.ai.AiExplanationService;
import com.udea.labdrools.model.CreditRequest;
import com.udea.labdrools.model.CreditResponse;
import com.udea.labdrools.model.Customer;
import com.udea.labdrools.service.CreditEvaluationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/credit")
public class CreditEvaluationController {

    @Autowired
    private CreditEvaluationService evaluationService;

    @Autowired
    private AiExplanationService aiService;

    // --- ENDPOINTS WEB (Páginas HTML Thymeleaf) ---

    // Mostrar el formulario web
    @GetMapping("/form")
    public String showCreditForm(Model model) {
        CreditRequest creditRequest = new CreditRequest();
        creditRequest.setCustomer(new Customer());
        model.addAttribute("creditRequest", creditRequest);
        return "credit_form";
    }

    // Procesar la solicitud desde el formulario web
    @PostMapping("/evaluate")
    public String evaluateCreditWeb(@Valid @ModelAttribute("creditRequest") CreditRequest creditRequest, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "credit_form";
        }
        CreditResponse creditResponse = evaluationService.evaluateCredit(creditRequest);
        model.addAttribute("creditResponse", creditResponse);
        return "credit_result";
    }

    // --- ENDPOINTS API REST (Para Postman y respuesta JSON) ---

    @PostMapping("/api/evaluate")
    @ResponseBody
    public CreditResponse evaluateCreditApi(@Valid @RequestBody CreditRequest request, BindingResult result) {
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors().stream()
                    .map(error -> error.getDefaultMessage())
                    .reduce((msg1, msg2) -> msg1 + "; " + msg2)
                    .orElse("Errores de validacion");
            return new CreditResponse(false, 0.0, 0.0, "Error de validacion: " + errorMessage);
        }
        return evaluationService.evaluateCredit(request);
    }

    @PostMapping("/evaluateCredit")
    @ResponseBody
    public Object evaluate(@RequestBody CreditRequest customer) {
        CreditResponse decision = evaluationService.evaluateCredit(customer);
        String explanation = aiService.explain(decision.getMessage());

        return new Object() {
            public final CreditResponse result = decision;
            public final String aiExplanation = explanation;
        };
    }
}