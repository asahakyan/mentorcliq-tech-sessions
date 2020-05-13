package com.asahakyan.homework.game;

import com.asahakyan.homework.game.action.attack.ShootAttack;
import com.asahakyan.homework.game.bridge.InputDeviceDefault;
import com.asahakyan.homework.game.controller.GameRunner;
import com.asahakyan.homework.game.controller.InputController;
import com.asahakyan.homework.game.libs.bridge.KeyboardImplementor;
import com.asahakyan.homework.game.personage.GamePersonage;
import com.asahakyan.runner.PatternRunner;

public class GameHomework implements PatternRunner {
    @Override
    public void run() {
        init();
    }


    private void init() {
        GamePersonage personage = GameRunner.getDefaultPersonage();

        // strategy example
        personage.action().attack();
        personage.action().jump();
        personage.action().setAttackStrategy(new ShootAttack());
        personage.action().attack();

        System.out.println(personage.getName());
        personage.printMyStats();

        // here goes adapter part to change the personage and call above 2 functions
        personage = GameRunner.getImportedPersonage();
        System.out.println(personage.getName());
        personage.printMyStats();
        personage.action().attack();
        personage.action().move();

        InputController inputController = new InputController(new InputDeviceDefault(new KeyboardImplementor()));
        inputController.addListener(new GameRunner(personage));

        while (true) {
            inputController.listen();
        }

    }
}
