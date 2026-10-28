package com.udea.labdrools.service;

import com.udea.labdrools.model.AirlineRequest;
import com.udea.labdrools.model.AirlineResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineEvaluationService {

    @Autowired
    private KieContainer kieContainer;

    public AirlineResponse evaluateAirlineRules(AirlineRequest request) {
        AirlineResponse response = new AirlineResponse();
        KieSession kieSession = kieContainer.newKieSession();

        try {
            kieSession.insert(request.getPassenger());
            kieSession.insert(request.getFlight());
            kieSession.insert(response);
            kieSession.fireAllRules();
        } finally {
            kieSession.dispose();
        }

        return response;
    }
}