package com.asahakyan.homework.game.controller;

import com.asahakyan.homework.game.personage.GamePersonage;

public class JoystickController implements InputController {
    private GamePersonage gamePersonage;

    public JoystickController(GamePersonage gamePersonage) {
        this.gamePersonage = gamePersonage;
    }

    public void getPressedButton(String button) {
        if (button.equals("a")) {
            jump();
        }

        if (button.equals("b")) {
            attack();
        }
    }

    public void detectJoystickMove(int moveValue) {
        if (moveValue != 0) {
            move();
        }
    }

    @Override
    public void move() {
        System.out.println("Moving! Controlled with the joystick");
        gamePersonage.action().move();
    }

    @Override
    public void jump() {
        System.out.println("Jumping! Controlled with the joystick");
        gamePersonage.action().jump();
    }

    @Override
    public void attack() {
        System.out.println("Attacking! Controlled with the joystick");
        gamePersonage.action().attack();
    }
}
