package com.asahakyan.patterns.strategy.jump;

public class HighJump implements JumpStrategy {
    @Override
    public String jump() {
        return "jump: high";
    }
}
