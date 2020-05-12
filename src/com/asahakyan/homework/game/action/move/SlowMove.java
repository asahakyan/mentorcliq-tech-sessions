package com.asahakyan.homework.game.action.move;

public class SlowMove implements MoveStrategy {
    @Override
    public String move() {
        return "move: slow";
    }
}
