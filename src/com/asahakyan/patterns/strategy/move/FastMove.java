package com.asahakyan.patterns.strategy.move;

public class FastMove implements MoveStrategy{
    @Override
    public String move() {
        return "move: fast";
    }
}
