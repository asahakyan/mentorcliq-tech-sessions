package com.asahakyan.patterns.abstract_factory.surgery_environment;

public class SurgeryEnvironment {
    private final SurgeryAbstractFactory factory;

    public SurgeryEnvironment(SurgeryAbstractFactory factory) {
        this.factory = factory;
    }

    public void doSurgery() {
        this.factory.getSurgeryTools().wash();
        this.factory.getPatient().preparePatient();
    }
}
