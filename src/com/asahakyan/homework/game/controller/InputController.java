package com.asahakyan.homework.game.controller;

import com.asahakyan.homework.game.personage.GamePersonage;

public interface InputController {
    abstract public void move();
    abstract public void jump();
    abstract public void attack();
}
