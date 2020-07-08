package com.asahakyan.patterns.abstract_factory.surgery_environment.student;

import com.asahakyan.patterns.abstract_factory.surgery_environment.SurgeryTools;

public class StudentSurgeryTools implements SurgeryTools {
    @Override
    public void wash() {
        System.out.println("Tools for students are ready");
    }
}
