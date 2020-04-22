package com.asahakyan.patterns.strategy.move;

public class NormalMove implements MoveStrategy {
    @Override
    public String move() {
        return "move: normal";
    }
}
