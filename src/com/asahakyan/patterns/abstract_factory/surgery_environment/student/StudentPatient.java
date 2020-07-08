package com.asahakyan.patterns.abstract_factory.surgery_environment.student;

import com.asahakyan.patterns.abstract_factory.surgery_environment.Patient;

public class StudentPatient implements Patient {
    @Override
    public void preparePatient() {
        System.out.println("Maquette patient is prepared");
    }
}
