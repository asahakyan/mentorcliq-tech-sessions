package com.asahakyan.patterns.decorator.disk;

import com.asahakyan.patterns.decorator.tuning.CarTuning;
import com.asahakyan.patterns.decorator.tuning.CarTuningDecorator;

public class DiskDecorator extends CarTuningDecorator {
    protected DiskColor diskColor;

    public DiskDecorator(CarTuning decoratedCarTuning) {
        super(decoratedCarTuning);
        this.diskColor = DiskColor.BLACK;
    }

    public DiskDecorator(CarTuning decoratedCarTuning, DiskColor diskColor) {
        super(decoratedCarTuning);
        this.diskColor = diskColor;
    }

    @Override
    public void tune() {
        decoratedCarTuning.tune();
        System.out.println("Disk tuned with color: " + diskColor);
    }

    @Override
    public int price() {
        return super.price() + 10;
    }
}
