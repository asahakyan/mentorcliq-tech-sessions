package com.asahakyan.homework.game;

import com.asahakyan.homework.game.action.ActionStrategy;
import com.asahakyan.homework.game.action.attack.NoAttack;
import com.asahakyan.homework.game.action.attack.ShootAttack;
import com.asahakyan.homework.game.action.jump.NormalJump;
import com.asahakyan.homework.game.action.move.SlowMove;
import com.asahakyan.homework.game.personage.GamePersonage;
import com.asahakyan.homework.game.personage.MarioPersonage;
import com.asahakyan.runner.PatternRunner;

public class GameHomework implements PatternRunner {
    @Override
    public void run() {
        loadConfiguration();

        playTheGame();

        saveConfiguration();
    }

    private static void loadConfiguration() {
        //load the config: singleton pattern
    }

    private static void saveConfiguration() {
        //save the config: singleton pattern
    }

    private void playTheGame() {
        GamePersonage personage = getDefaultPersonage();
        // strategy example
        personage.action().attack();
        personage.action().jump();
        personage.action().setAttackStrategy(new ShootAttack());
        personage.action().attack();

        //TODO adapter example
        System.out.println(personage.getName());
        personage.printMyStats();
        // here goes adapter part to change the personage and call above 2 functions
        //personage = getImportedPersonage();
        //System.out.println(personage.getName());
        //personage.printMyStats();

        //TODO bridge example

    }

    private GamePersonage getDefaultPersonage() {
        return new MarioPersonage(getDefaultActionStrategy());
    }

    private ActionStrategy getDefaultActionStrategy() {
        return new ActionStrategy(new SlowMove(), new NormalJump(), new NoAttack());
    }

    private GamePersonage getImportedPersonage() {
        //TODO we should use Eddy from Tekken here
        return null;
    }
}
