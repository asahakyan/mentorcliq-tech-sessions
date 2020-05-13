package com.asahakyan.homework.game;

import com.asahakyan.homework.game.action.ActionStrategy;
import com.asahakyan.homework.game.action.attack.NoAttack;
import com.asahakyan.homework.game.action.attack.ShootAttack;
import com.asahakyan.homework.game.action.jump.NormalJump;
import com.asahakyan.homework.game.action.move.SlowMove;
import com.asahakyan.homework.game.action.move.FastMove;
import com.asahakyan.homework.game.controller.JoystickController;
import com.asahakyan.homework.game.controller.KeyboardController;
import com.asahakyan.homework.game.libs.personage.tekken.EddyPersonage;
import com.asahakyan.homework.game.personage.GamePersonage;
import com.asahakyan.homework.game.personage.MarioPersonage;
import com.asahakyan.patterns.strategy.move.MoveStrategy;
import com.asahakyan.runner.PatternRunner;
import src.com.asahakyan.homework.game.adapter.EddyPersonageAdapter;

public class GameHomework implements PatternRunner {
    @Override
    public void run() {
        loadConfiguration();

        init();

        saveConfiguration();
    }

    private static void loadConfiguration() {
        //load the config: singleton pattern
    }

    private static void saveConfiguration() {
        //save the config: singleton pattern
    }

    private void init() {
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
        personage = getImportedPersonage();
        System.out.println(personage.getName());
        personage.printMyStats();
        personage.action().attack();
        personage.action().move();

        //TODO bridge example

        System.out.println();
        KeyboardController keyboard = new KeyboardController(personage);
        keyboard.getPressedKey("a");
        keyboard.getPressedKey("space");

        System.out.println();
        JoystickController joystick = new JoystickController(personage);
        joystick.detectJoystickMove(2);

        personage.action().setMoveStrategy(new FastMove());
        joystick.detectJoystickMove(2);
    }

    private GamePersonage getDefaultPersonage() {
        return new MarioPersonage(getDefaultActionStrategy());
    }

    private ActionStrategy getDefaultActionStrategy() {
        return new ActionStrategy(new SlowMove(), new NormalJump(), new NoAttack());
    }

    private GamePersonage getImportedPersonage() {
        EddyPersonage eddyPersonage = new EddyPersonage();
        GamePersonage eddy = new EddyPersonageAdapter(getDefaultActionStrategy(), eddyPersonage);
        return eddy;
    }
}
