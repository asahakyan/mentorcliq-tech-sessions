package com.asahakyan.patterns.abstract_factory.surgery_environment.hospital;

import com.asahakyan.patterns.abstract_factory.surgery_environment.SurgeryTools;

public class HospitalSurgeryTools implements SurgeryTools {
    @Override
    public void wash() {
        System.out.println("Real tools are washed and prepared");
    }
}
