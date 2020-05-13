package com.asahakyan.homework.game.controller;

import com.asahakyan.homework.game.personage.GamePersonage;

public class KeyboardController implements InputController {
    private GamePersonage gamePersonage;

    public KeyboardController(GamePersonage gamePersonage) {
        this.gamePersonage = gamePersonage;
    }

    public void getPressedKey(String key) {
        if (key.equals("a") || key.equals("d")) {
            move();
        }

        if (key.equals("space")) {
            jump();
        }

        if (key.equals("f")) {
            attack();
        }
    }

    @Override
    public void move() {
        System.out.println("Moving! Controlled with the keyboard");
        gamePersonage.action().move();
    }

    @Override
    public void jump() {
        System.out.println("Jumping! Controlled with the keyboard");
        gamePersonage.action().jump();
    }

    @Override
    public void attack() {
        System.out.println("Attacking! Controlled with the keyboard");
        gamePersonage.action().attack();
    }
}
