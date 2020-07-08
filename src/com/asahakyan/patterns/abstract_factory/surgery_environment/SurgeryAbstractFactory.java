package com.asahakyan.patterns.abstract_factory.surgery_environment;

public abstract class SurgeryAbstractFactory {
    public abstract Patient getPatient();

    public abstract SurgeryTools getSurgeryTools();
}
