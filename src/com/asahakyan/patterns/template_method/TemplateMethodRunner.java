package com.asahakyan.patterns.template_method;

import com.asahakyan.patterns.template_method.business.BusinessService;
import com.asahakyan.patterns.template_method.residential.ResidentialService;
import com.asahakyan.runner.PatternRunner;

public class TemplateMethodRunner implements PatternRunner {

    @Override
    public void run() {
        System.out.println("TEMPLATE METHOD EXAMPLE");
        System.out.println("\nBUSINESS SERVICE");
        ConstructionServiceSystem service1 = new BusinessService();
        service1.build();
        System.out.println("\nRESIDENTIAL SERVICE");
        ConstructionServiceSystem service2 = new ResidentialService();
        service2.build();
    }
}
