package com.asahakyan.patterns.facade.tool;

public class LightSystem {

    public void off() {
        System.out.println("the light is off");
    }

    public void low() {
        System.out.println("low light");
    }

    public void normal() {
        System.out.println("normal light");
    }

    public void bright() {
        System.out.println("the light is bright");
    }
}
