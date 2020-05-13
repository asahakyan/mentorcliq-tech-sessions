package com.asahakyan.homework.game.controller;

import com.asahakyan.homework.game.personage.GamePersonage;

public class GamepadController implements InputController {
    private GamePersonage gamePersonage;

    public GamepadController(GamePersonage gamePersonage) {
        this.gamePersonage = gamePersonage;
    }

    public void getPressedButton(String button) {
        if (button.equals("left") || button.equals("right")) {
            move();
        }

        if (button.equals("x")) {
            jump();
        }

        if (button.equals("b")) {
            attack();
        }
    }

    @Override
    public void move() {
        System.out.println("Moving! Controlled with the gamepad");
        gamePersonage.action().move();
    }

    @Override
    public void jump() {
        System.out.println("Jumping! Controlled with the gamepad");
        gamePersonage.action().jump();
    }


    @Override
    public void attack() {
        System.out.println("Attacking! Controlled with the gamepad");
        gamePersonage.action().attack();
    }
}
