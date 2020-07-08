package com.asahakyan.patterns.abstract_factory.surgery_environment.student;

import com.asahakyan.patterns.abstract_factory.surgery_environment.Patient;
import com.asahakyan.patterns.abstract_factory.surgery_environment.SurgeryAbstractFactory;
import com.asahakyan.patterns.abstract_factory.surgery_environment.SurgeryTools;
import com.asahakyan.patterns.abstract_factory.surgery_environment.hospital.HospitalPatient;
import com.asahakyan.patterns.abstract_factory.surgery_environment.hospital.HospitalSurgeryTools;

public class StudentFactory extends SurgeryAbstractFactory {
    @Override
    public Patient getPatient() {
        return new StudentPatient();
    }

    @Override
    public SurgeryTools getSurgeryTools() {
        return new StudentSurgeryTools();
    }
}
