package com.asahakyan.homework.game.libs.bridge;

import java.util.Scanner;

public class KeyboardImplementor implements InputDeviceImplementor {
    Scanner sc = new Scanner(System.in);

    @Override
    public String getInput() {
        String key = sc.nextLine();
        if (key.equals("a")) {
            return "a";
        } else if (key.equals("d")) {
            return "d";
        } else if (key.equals(" ")) {
            return "space";
        } else if (key.equals("f")) {
            return "f";
        } else if (key.equals("end")) {
            return "end";
        } else {
            return "s";
        }
    }

    @Override
    public String[] getDriver() {
        return new String[]{"a:0", "d:0", "space:1", "f:2", "end:999"};
    }
}
