package com.asahakyan.patterns.decorator;

import com.asahakyan.patterns.decorator.tuning.BmwTuning;
import com.asahakyan.patterns.decorator.tuning.CarTuning;
import com.asahakyan.patterns.decorator.disk.DiskColor;
import com.asahakyan.patterns.decorator.disk.DiskDecorator;
import com.asahakyan.patterns.decorator.engine.EngineDecorator;
import com.asahakyan.patterns.decorator.wash.CarWashType;
import com.asahakyan.patterns.decorator.wash.WashDecorator;
import com.asahakyan.runner.PatternRunner;

public class DecoratorRunner implements PatternRunner {
    @Override
    public void run() {
        System.out.println("DECORATOR EXAMPLE");
        System.out.println("Creating simple Car");
        CarTuning bmw = new BmwTuning();
        bmw.tune();
        System.out.println("total price is: " + bmw.price());


        System.out.println("\nCreating BMW with disk tuned");
        CarTuning bmw2 = new DiskDecorator(new BmwTuning());
        bmw2.tune();
        System.out.println("total price is: " + bmw2.price());

        System.out.println("\nFull tuning");
        CarTuning bmw3 = new WashDecorator(new DiskDecorator(new EngineDecorator(new BmwTuning()), DiskColor.WHITE), CarWashType.EXTERIOR);
        bmw3.tune();
        System.out.println("total price is: " + bmw3.price());
    }
}
