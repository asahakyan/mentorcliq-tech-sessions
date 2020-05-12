package com.asahakyan.homework.game.action;

import com.asahakyan.homework.game.action.attack.AttackStrategy;
import com.asahakyan.homework.game.action.jump.JumpStrategy;
import com.asahakyan.homework.game.action.move.MoveStrategy;

public class ActionStrategy {
    private MoveStrategy moveStrategy;
    private JumpStrategy jumpStrategy;
    private AttackStrategy attackStrategy;

    public ActionStrategy(MoveStrategy moveStrategy, JumpStrategy jumpStrategy, AttackStrategy attackStrategy) {
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
