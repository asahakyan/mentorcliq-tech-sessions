package com.asahakyan.patterns.factory_method.cargo_ware;

import com.asahakyan.patterns.factory_method.Cargo;

public class HouseholdAppliancesFactory extends CargoWareServiceFactory {
    @Override
    Cargo createCargo() {
        return new Cargo() {
            @Override
            public void getGoods() {
                System.out.println("HouseholdAppliances getGoods");
            }
        };
    }
}
