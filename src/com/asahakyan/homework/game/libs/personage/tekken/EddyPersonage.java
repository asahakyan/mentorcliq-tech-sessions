package com.asahakyan.homework.game.libs.personage.tekken;

public class EddyPersonage implements TekkenPersonage {

    @Override
    public String getFullName() {
        return "Eddy Gordo";
    }

    @Override
    public String getStrength() {
        StringBuilder sb = new StringBuilder();
        sb.append("height: 188cm\n");
        sb.append("weight: 75kg\n");
        sb.append("hand kick: 6\n");
        sb.append("leg kick: 9\n");
        return sb.toString();
    }
}
