package com.asahakyan.patterns.abstract_factory.surgery_environment;

import com.asahakyan.patterns.abstract_factory.surgery_environment.hospital.HospitalFactory;
import com.asahakyan.patterns.abstract_factory.surgery_environment.student.StudentFactory;

public class FactoryProducer {
    public static SurgeryAbstractFactory getFactory(EnvironmentTypes type) {
        switch (type) {
            case HOSPITAL:
                return new HospitalFactory();
            default:
                return new StudentFactory();
        }
    }
}
