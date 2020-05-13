package com.asahakyan.homework.game.bridge;

import com.asahakyan.homework.game.libs.bridge.InputDeviceImplementor;

import java.util.HashMap;
import java.util.Map;

public class InputDeviceDefault implements InputDevice {
    private InputDeviceImplementor inputDeviceImplementor;

    public InputDeviceDefault(InputDeviceImplementor inputDeviceImplementor) {
        this.inputDeviceImplementor = inputDeviceImplementor;
    }

    @Override
    public String getInputAction() {
        return inputDeviceImplementor.getInput();
    }

    @Override
    public Map<String, Integer> getDriver() {
        Map<String, Integer> mapping = new HashMap<>();
        String[] driver = inputDeviceImplementor.getDriver();
        for (String val:driver) {
           String[] keyValue = val.split(":");
           mapping.put(keyValue[0], Integer.parseInt(keyValue[1]));
        }

        return mapping;
    }
}
