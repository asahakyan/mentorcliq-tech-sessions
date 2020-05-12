package com.asahakyan.homework.game.personage;

import com.asahakyan.homework.game.action.ActionStrategy;

final public class MarioPersonage extends GamePersonage {

    public MarioPersonage(ActionStrategy actionStrategy) {
        super(actionStrategy);
    }

    @Override
    public String getName() {
        return "Super Mario";
    }

    @Override
    public void printMyStats() {
        System.out.println("My level is " + getLevel() + " and size is " + getSize());
    }

    private String getLevel() {
        return "7";
    }

    private String getSize() {
        return "small";
    }
}
