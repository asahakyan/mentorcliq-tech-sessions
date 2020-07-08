package com.asahakyan.patterns.abstract_factory;

import com.asahakyan.patterns.abstract_factory.surgery_environment.EnvironmentTypes;
import com.asahakyan.patterns.abstract_factory.surgery_environment.FactoryProducer;
import com.asahakyan.patterns.abstract_factory.surgery_environment.SurgeryAbstractFactory;
import com.asahakyan.patterns.abstract_factory.surgery_environment.SurgeryEnvironment;
import com.asahakyan.runner.Pattern;
import com.asahakyan.runner.PatternRunner;

public class AbstractFactoryRunner implements PatternRunner {
    @Override
    public void run() {
        System.out.println("ABSTRACT FACTORY EXAMPLE");

        System.out.println("\nStudent Example:");
        SurgeryEnvironment env1 = new SurgeryEnvironment(FactoryProducer.getFactory(EnvironmentTypes.STUDENT));
        env1.doSurgery();
        System.out.println("\nReal Example:");
        SurgeryEnvironment env2 = new SurgeryEnvironment(FactoryProducer.getFactory(EnvironmentTypes.HOSPITAL));
        env2.doSurgery();
    }

}
