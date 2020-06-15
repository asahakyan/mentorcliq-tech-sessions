package com.asahakyan.patterns.template_method.business;

import com.asahakyan.patterns.template_method.ConstructionServiceSystem;

public class BusinessService extends ConstructionServiceSystem {
    @Override
    protected void installHeating() {
        System.out.println("Centralized heating system is installed");
    }

    @Override
    protected void installCooling() {
        System.out.println("Centralized cooling system is installed");
    }

    @Override
    protected void installWindows() {
        System.out.println("Stained, high-quality windows with voice isolation and ultra-violet rays protection are installed");
    }

    @Override
    protected void buildGarden() {
        System.out.println("Small garden with lunch tables and chairs is constructed");
    }
}
