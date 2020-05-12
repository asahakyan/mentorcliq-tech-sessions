package com.asahakyan.homework.game.action.jump;

public class NormalJump implements JumpStrategy {
    @Override
    public String jump() {
        return "jump: normal";
    }
}
