package com.asahakyan.patterns.strategy;

import com.asahakyan.runner.PatternRunner;
import com.asahakyan.patterns.strategy.attack.NoAttack;
import com.asahakyan.patterns.strategy.attack.ShootAttack;
import com.asahakyan.patterns.strategy.jump.HighJump;
import com.asahakyan.patterns.strategy.jump.NormalJump;
import com.asahakyan.patterns.strategy.move.FastMove;
import com.asahakyan.patterns.strategy.move.NormalMove;

public class StrategyRunner implements PatternRunner {
    @Override
    public void run() {
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
