package com.asahakyan.patterns.decorator.engine;

import com.asahakyan.patterns.decorator.tuning.CarTuning;
import com.asahakyan.patterns.decorator.tuning.CarTuningDecorator;

public class EngineDecorator extends CarTuningDecorator {
    public EngineDecorator(CarTuning decoratedCarTuning) {
        super(decoratedCarTuning);
    }

    @Override
    public void tune() {
        System.out.println("Engine tuned");
    }

    @Override
    public int price() {
        return super.price() + 5;
    }
}
