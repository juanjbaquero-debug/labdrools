package com.udea.labdrools.controller;

import com.udea.labdrools.model.AirlineRequest;
import com.udea.labdrools.model.AirlineResponse;
import com.udea.labdrools.service.AirlineEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airline")
public class AirlineController {

    @Autowired
    private AirlineEvaluationService evaluationService;

    @PostMapping("/api/evaluate")
    public AirlineResponse evaluateAirlineApi(@RequestBody AirlineRequest request) {
        return evaluationService.evaluateAirlineRules(request);
    }
}