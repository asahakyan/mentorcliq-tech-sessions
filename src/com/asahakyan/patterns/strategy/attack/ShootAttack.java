package com.asahakyan.patterns.strategy.attack;

public class ShootAttack implements AttackStrategy {
    @Override
    public String attack() {
        return "attack: shoot";
    }
}
