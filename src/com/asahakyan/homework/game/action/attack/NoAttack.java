package com.asahakyan.homework.game.action.attack;

public class NoAttack implements AttackStrategy {
    @Override
    public String attack() {
        return "attack: none";
    }
}
