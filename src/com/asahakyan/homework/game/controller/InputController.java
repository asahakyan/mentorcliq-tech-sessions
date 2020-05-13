package com.asahakyan.homework.game.controller;

import com.asahakyan.homework.game.bridge.InputDevice;

import java.util.Map;

public class InputController {
    public InputDevice inputDevice;
    private InputListener listener = null;
    private Map<String, Integer> driver;

    public InputController(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
        this.driver = inputDevice.getDriver();
    }

    public void addListener(InputListener inputListener) {
        this.listener = inputListener;
    }

    public void listen() {
        String key = inputDevice.getInputAction();
        Integer code = driver.get(key);

        if (code == null) {
            System.out.println("Not supported action, skip");
        } else {
            if (code == 0) {
                listener.moveTrigger();
            } else if (code == 1) {
                listener.jumpTrigger();
            } else if (code == 2) {
                listener.attackTrigger();
            } else {
                //TODO;
            }
        }
    }
}
