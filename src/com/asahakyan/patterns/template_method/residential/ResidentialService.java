package com.asahakyan.patterns.template_method.residential;

import com.asahakyan.patterns.template_method.ConstructionServiceSystem;

public class ResidentialService extends ConstructionServiceSystem {
    @Override
    protected void installHeating() {
        System.out.println("Individual heating systems are installed");
    }

    @Override
    protected void installCooling() {
        System.out.println("Individual cooling systems are installed");
    }

    @Override
    protected void installWindows() {
        System.out.println("Half-height usual windows are installed");
    }

    @Override
    protected void buildGarden() {
        System.out.println("Big garden with chairs and playground is constructed");
    }
}
