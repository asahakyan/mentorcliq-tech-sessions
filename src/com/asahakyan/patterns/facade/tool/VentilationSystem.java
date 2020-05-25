package com.asahakyan.patterns.facade.tool;

public class VentilationSystem {
    public void off() {
        System.out.println("the air conditioning is off");
    }

    public void cool() {
        System.out.println("cool temperature");
    }

    public void normal() {
        System.out.println("normal temperature");
    }

    public void warm() {
        System.out.println("warm temperature");
    }

    public void lowHumidity() {
        System.out.println("low humidity");
    }

    public void normalHumidity() {
        System.out.println("normal humidity");
    }

    public void highHumidity() {
        System.out.println("high humidity");
    }

}
