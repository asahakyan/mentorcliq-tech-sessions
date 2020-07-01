package com.asahakyan.patterns.factory_method.cargo_ware;

import com.asahakyan.patterns.factory_method.Cargo;

public abstract class CargoWareServiceFactory {

    public void process() {
        Cargo cargo = createCargo();
        cargo.getGoods();
        if (cargo.isValid()) {
            cargo.loadAndTransportGoods();
        }
    }

    abstract Cargo createCargo();
}
