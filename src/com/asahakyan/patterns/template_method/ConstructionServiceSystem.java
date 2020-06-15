package com.asahakyan.patterns.template_method;

abstract public class ConstructionServiceSystem {
    public final void build() {
        buildBuilding();
        buildParking();
        installSewage();
        installHeating();
        installCooling();
        installWindows();
        buildGarden();
    }

    protected final void buildBuilding() {
        System.out.println("Common buildings are constructed");
    }

    protected final void buildParking() {
        System.out.println("Common parking is constructed");
    }

    protected final void installSewage() {
        System.out.println("Common sewage is installed");
    }

    protected abstract void installHeating();

    protected abstract void installCooling();

    protected abstract void buildGarden();

    protected abstract void installWindows();
}
