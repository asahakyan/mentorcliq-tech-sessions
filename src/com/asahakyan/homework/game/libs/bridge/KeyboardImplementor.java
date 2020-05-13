package com.asahakyan.homework.game.libs.bridge;

import java.util.Scanner;

public class KeyboardImplementor implements InputDeviceImplementor {
    @Override
    public String getInput() {
        Scanner sc = new Scanner(System.in);

        String key = sc.nextLine();
        if (key.equals("a")) {
            return "a";
        } else if (key.equals("d")) {
            return "d";
        } else if (key.equals(" ")) {
            return "space";
        } else if (key.equals("f")) {
            return "f";
        } else {
            return "s";
        }
    }

    @Override
    public String[] getDriver() {
        String[] driver = {"a:0","d:0","space:1", "f:2"};
        return driver;
    }
}
