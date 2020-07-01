package com.asahakyan.patterns.factory_method;

import com.asahakyan.patterns.factory_method.cargo_ware.AgriculturalProductsFactory;
import com.asahakyan.patterns.factory_method.cargo_ware.CargoWareServiceFactory;
import com.asahakyan.patterns.factory_method.cargo_ware.HouseholdAppliancesFactory;
import com.asahakyan.runner.PatternRunner;

public class FactoryMethodRunner implements PatternRunner {
    @Override
    public void run() {
        System.out.println("FACTORY METHOD EXAMPLE");
        System.out.println("\nHOUSEHOLD");
        CargoWareServiceFactory service = new HouseholdAppliancesFactory();
        service.process();

        System.out.println("\nAGRICULTURAL");
        service = new AgriculturalProductsFactory();
        service.process();
    }
}
