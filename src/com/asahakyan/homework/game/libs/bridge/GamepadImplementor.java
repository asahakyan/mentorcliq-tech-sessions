package com.asahakyan.homework.game.libs.bridge;

public class GamepadImplementor implements InputDeviceImplementor {
    @Override
    public String getInput() {
        return "y";
    }

    @Override
    public String[] getDriver() {
        String[] driver = {"x:0","y:1","z:3"};
        return driver;
    }
}
