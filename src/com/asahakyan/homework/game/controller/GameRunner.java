package com.asahakyan.homework.game.controller;

import com.asahakyan.homework.game.action.ActionStrategy;
import com.asahakyan.homework.game.action.attack.NoAttack;
import com.asahakyan.homework.game.action.jump.NormalJump;
import com.asahakyan.homework.game.action.move.SlowMove;
import com.asahakyan.homework.game.adapter.EddyPersonageAdapter;
import com.asahakyan.homework.game.libs.personage.tekken.EddyPersonage;
import com.asahakyan.homework.game.personage.GamePersonage;
import com.asahakyan.homework.game.personage.MarioPersonage;

public class GameRunner implements InputListener {
    private GamePersonage gamePersonage;

    public GameRunner() {
        init();
    }

    public GameRunner(GamePersonage gamePersonage) {
        this.gamePersonage = gamePersonage;
    }

    @Override
    public void moveTrigger() {
        gamePersonage.action().move();
    }

    @Override
    public void jumpTrigger() {
        gamePersonage.action().jump();
    }

    @Override
    public void attackTrigger() {
        gamePersonage.action().attack();
    }

    private void init() {
        this.gamePersonage = GameRunner.getDefaultPersonage();

    }

    public static GamePersonage getDefaultPersonage() {
        return new MarioPersonage(getDefaultActionStrategy());
    }

    public static ActionStrategy getDefaultActionStrategy() {
        return new ActionStrategy(new SlowMove(), new NormalJump(), new NoAttack());
    }

    public static GamePersonage getImportedPersonage() {
        EddyPersonage eddyPersonage = new EddyPersonage();
        GamePersonage eddy = new EddyPersonageAdapter(getDefaultActionStrategy(), eddyPersonage);
        return eddy;
    }
}
