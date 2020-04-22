package com.asahakyan.patterns.strategy;

import com.asahakyan.patterns.strategy.attack.AttackStrategy;
import com.asahakyan.patterns.strategy.attack.NoAttack;
import com.asahakyan.patterns.strategy.jump.JumpStrategy;
import com.asahakyan.patterns.strategy.jump.NormalJump;
import com.asahakyan.patterns.strategy.move.MoveStrategy;
import com.asahakyan.patterns.strategy.move.NormalMove;

public class Mario {
    private MoveStrategy moveStrategy;
    private JumpStrategy jumpStrategy;
    private AttackStrategy attackStrategy;

    public Mario(MoveStrategy moveStrategy, JumpStrategy jumpStrategy, AttackStrategy attackStrategy) {
        this.moveStrategy = moveStrategy;
        this.jumpStrategy = jumpStrategy;
        this.attackStrategy = attackStrategy;
    }

    public void move() {
        System.out.println(moveStrategy.move());
    }

    public void jump() {
        System.out.println(jumpStrategy.jump());
    }

    public void attack() {
        System.out.println(attackStrategy.attack());
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void setJumpStrategy(JumpStrategy jumpStrategy) {
        this.jumpStrategy = jumpStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
