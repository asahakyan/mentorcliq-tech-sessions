package com.asahakyan.patterns.factory_method;

public abstract class Cargo {
    public boolean isValid() {
        System.out.println("I'm valid");
        return true;
    }

    public void loadAndTransportGoods() {
        System.out.println("Goods are loaded and transported");
    }

    public abstract void getGoods();
}
