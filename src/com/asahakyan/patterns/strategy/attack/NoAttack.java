package com.asahakyan.patterns.strategy.attack;

public class NoAttack implements AttackStrategy {
    @Override
    public String attack() {
        return "attack: no";
    }
}
