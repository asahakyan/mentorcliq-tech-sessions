package com.asahakyan.homework.game;

import com.asahakyan.homework.game.action.attack.ShootAttack;
import com.asahakyan.homework.game.bridge.InputDeviceDefault;
import com.asahakyan.homework.game.controller.GameRunner;
import com.asahakyan.homework.game.controller.InputController;
import com.asahakyan.homework.game.libs.bridge.KeyboardImplementor;
import com.asahakyan.homework.game.personage.GamePersonage;
import com.asahakyan.homework.game.singleton.ConfigurationLoader;
import com.asahakyan.runner.PatternRunner;

public class GameHomework implements PatternRunner {
    @Override
    public void run() {
        ConfigurationLoader.getInstance().loadConfiguration();
        init();
    }

    private void init() {
        GamePersonage personage = GameRunner.getDefaultPersonage();

        System.out.println("\nSTRATEGY EXAMPLE");
        personage.action().attack();
        personage.action().jump();
        personage.action().setAttackStrategy(new ShootAttack());
        personage.action().attack();

        System.out.println("\nADAPTER EXAMPLE");
        System.out.println(personage.getName());
        personage.printMyStats();
        System.out.println("\nchanging to imported personage");
        personage = GameRunner.getImportedPersonage();
        System.out.println(personage.getName());
        personage.printMyStats();
        personage.action().attack();
        personage.action().move();

        System.out.println("\nTHE BEST PART");
        System.out.println("BRIDGE EXAMPLE WITH LISTENERS");
        System.out.println("input your action please");
        InputController inputController = new InputController(new InputDeviceDefault(new KeyboardImplementor()));
        inputController.addListener(new GameRunner(personage));
        while (true) {
            inputController.listen();
        }
    }
}
