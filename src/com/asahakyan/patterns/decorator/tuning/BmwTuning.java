package com.asahakyan.patterns.decorator.tuning;

public class BmwTuning implements CarTuning {
    @Override
    public void tune() {
        System.out.println("tuning BMW");
    }

    @Override
    public int price() {
        return 0;
    }
}
