package com.asahakyan.patterns.abstract_factory.surgery_environment.hospital;

import com.asahakyan.patterns.abstract_factory.surgery_environment.Patient;
import com.asahakyan.patterns.abstract_factory.surgery_environment.SurgeryAbstractFactory;
import com.asahakyan.patterns.abstract_factory.surgery_environment.SurgeryTools;
import com.asahakyan.patterns.abstract_factory.surgery_environment.hospital.HospitalPatient;

public class HospitalFactory extends SurgeryAbstractFactory {
    @Override
    public Patient getPatient() {
        return new HospitalPatient();
    }

    @Override
    public SurgeryTools getSurgeryTools() {
        return new HospitalSurgeryTools();
    }
}
