package com.asahakyan.patterns.abstract_factory.surgery_environment.hospital;

import com.asahakyan.patterns.abstract_factory.surgery_environment.Patient;

public class HospitalPatient implements Patient {
    @Override
    public void preparePatient() {
        System.out.println("Real patient is prepared");
    }
}
