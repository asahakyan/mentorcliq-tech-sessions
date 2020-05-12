package src.com.asahakyan.homework.game.adapter;

import com.asahakyan.homework.game.personage.GamePersonage;
import com.asahakyan.homework.game.libs.personage.tekken.EddyPersonage;
import com.asahakyan.homework.game.action.ActionStrategy;


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
        eddyPersonage.getStrength();
    }
}
