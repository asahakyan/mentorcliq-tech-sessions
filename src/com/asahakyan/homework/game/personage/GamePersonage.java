package com.asahakyan.homework.game.personage;

import com.asahakyan.homework.game.action.ActionStrategy;

public abstract class GamePersonage {
    private final ActionStrategy actionStrategy;

    protected GamePersonage(ActionStrategy actionStrategy) {
        this.actionStrategy = actionStrategy;
    }

    public ActionStrategy action() {
        return actionStrategy;
    }

    public abstract String getName();

    public abstract void printMyStats();

}
