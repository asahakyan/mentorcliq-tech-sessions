package com.asahakyan.patterns.factory_method.cargo_ware;

import com.asahakyan.patterns.factory_method.Cargo;

public class AgriculturalProductsFactory extends CargoWareServiceFactory {
    @Override
    Cargo createCargo() {
        return new Cargo() {
            @Override
            public void getGoods() {
                System.out.println("AgriculturalProducts getGoods");
            }

            @Override
            public boolean isValid() {
                System.out.println("for Agricultural I'm not valid");
                return false;
            }
        };
    }
}
