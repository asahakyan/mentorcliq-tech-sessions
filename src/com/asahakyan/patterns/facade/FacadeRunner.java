package com.asahakyan.patterns.facade;

import com.asahakyan.runner.PatternRunner;

public class FacadeRunner implements PatternRunner {
    @Override
    public void run() {
        System.out.println("FACADE EXAMPLE");
        SmartRemoteControl remote = new SmartRemoteControl();
        remote.modeWorkout();
        remote.modeOut();
        remote.modeBackFromWork();
        remote.modeParty();
        remote.modeSleep();
        remote.modeVacation();
    }
}
