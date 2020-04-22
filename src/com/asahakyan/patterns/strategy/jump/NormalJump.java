package com.asahakyan.patterns.strategy.jump;

public class NormalJump implements JumpStrategy {
    @Override
    public String jump() {
        return "jump: normal";
    }
}
