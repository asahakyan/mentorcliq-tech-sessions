package com.asahakyan.patterns.decorator.tuning;

import com.asahakyan.patterns.decorator.tuning.CarTuning;

public abstract class CarTuningDecorator implements CarTuning {
    protected CarTuning decoratedCarTuning;

    public CarTuningDecorator(CarTuning decoratedCarTuning) {
        this.decoratedCarTuning = decoratedCarTuning;
    }

    @Override
    public int price() {
        return decoratedCarTuning.price();
    }
}
