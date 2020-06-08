package com.asahakyan.patterns.decorator.wash;

import com.asahakyan.patterns.decorator.tuning.CarTuning;
import com.asahakyan.patterns.decorator.tuning.CarTuningDecorator;

public class WashDecorator extends CarTuningDecorator {
    protected CarWashType type;

    public WashDecorator(CarTuning decoratedCarTuning) {
        super(decoratedCarTuning);
        this.type = CarWashType.FULL;
    }

    public WashDecorator(CarTuning decoratedCarTuning, CarWashType type) {
        super(decoratedCarTuning);
        this.type = type;
    }

    @Override
    public void tune() {
        decoratedCarTuning.tune();
        System.out.println("Car " + type + " is washed");
    }

    @Override
    public int price() {
        return super.price() + 1;
    }
}

