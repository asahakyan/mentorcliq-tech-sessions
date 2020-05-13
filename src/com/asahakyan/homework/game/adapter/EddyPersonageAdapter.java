package com.asahakyan.homework.game.adapter;

import com.asahakyan.homework.game.action.ActionStrategy;
import com.asahakyan.homework.game.libs.personage.tekken.EddyPersonage;
import com.asahakyan.homework.game.personage.GamePersonage;


public class EddyPersonageAdapter extends GamePersonage {

    EddyPersonage eddyPersonage;

    public EddyPersonageAdapter(ActionStrategy actionStrategy, EddyPersonage newEddyPersonage) {
        super(actionStrategy);
        eddyPersonage = newEddyPersonage;
    }

    @Override
    public String getName() {
        return eddyPersonage.getFullName();
    }

    @Override
    public void printMyStats() {
        System.out.print(eddyPersonage.getStrength());
    }
}
