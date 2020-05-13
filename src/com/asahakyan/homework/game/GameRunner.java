package com.asahakyan.homework.game;

import com.asahakyan.homework.game.action.ActionStrategy;
import com.asahakyan.homework.game.action.attack.NoAttack;
import com.asahakyan.homework.game.action.attack.ShootAttack;
import com.asahakyan.homework.game.action.jump.NormalJump;
import com.asahakyan.homework.game.action.move.SlowMove;
import com.asahakyan.homework.game.controller.InputListener;
import com.asahakyan.homework.game.libs.personage.tekken.EddyPersonage;
import com.asahakyan.homework.game.personage.GamePersonage;
import com.asahakyan.homework.game.personage.MarioPersonage;

public class GameRunner implements InputListener {
    private GamePersonage gamePersonage;

    public GameRunner() {
        init();
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
        this.gamePersonage = getDefaultPersonage();

    }

    private GamePersonage getDefaultPersonage() {
        return new MarioPersonage(getDefaultActionStrategy());
    }

    private ActionStrategy getDefaultActionStrategy() {
        return new ActionStrategy(new SlowMove(), new NormalJump(), new NoAttack());
    }

    private GamePersonage getImportedPersonage() {
        EddyPersonage eddyPersonage = new EddyPersonage();
        GamePersonage eddy = new src.com.asahakyan.homework.game.adapter.EddyPersonageAdapter(getDefaultActionStrategy(), eddyPersonage);
        return eddy;
    }
}
