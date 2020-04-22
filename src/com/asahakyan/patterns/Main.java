package com.asahakyan.patterns;

import com.asahakyan.patterns.strategy.Mario;
import com.asahakyan.patterns.strategy.attack.NoAttack;
import com.asahakyan.patterns.strategy.attack.ShootAttack;
import com.asahakyan.patterns.strategy.jump.HighJump;
import com.asahakyan.patterns.strategy.jump.NormalJump;
import com.asahakyan.patterns.strategy.move.FastMove;
import com.asahakyan.patterns.strategy.move.NormalMove;

public class Main {

    public static void main(String[] args) {
        runStrategyPattern();
    }

    private static void runStrategyPattern() {
        Mario mario = new Mario(new NormalMove(), new NormalJump(), new NoAttack());

        mario.move();
        mario.jump();
        mario.attack();

        System.out.println("change move");
        mario.setMoveStrategy(new FastMove());
        mario.move();

        System.out.println("change jump");
        mario.setJumpStrategy(new HighJump());
        mario.jump();

        System.out.println("change attack");
        mario.setAttackStrategy(new ShootAttack());

        mario.attack();
    }

}
