package com.asahakyan.patterns.facade;

import com.asahakyan.patterns.facade.tool.LightSystem;
import com.asahakyan.patterns.facade.tool.SoundSystem;
import com.asahakyan.patterns.facade.tool.VentilationSystem;

import static java.lang.System.out;

public class SmartRemoteControl {
    private LightSystem lightSystem;
    private SoundSystem soundSystem;
    private VentilationSystem ventilationSystem;

    public SmartRemoteControl() {
        this.lightSystem = new LightSystem();
        this.soundSystem = new SoundSystem();
        this.ventilationSystem = new VentilationSystem();
    }

    public void modeWorkout() {
        out.println("\nWORKOUT MODE");
        lightSystem.bright();
        ventilationSystem.cool();
        ventilationSystem.lowHumidity();
        soundSystem.normal();
        soundSystem.extraBassMode();
    }

    public void modeOut() {
        out.println("\nOUT MODE");
        lightSystem.off();
        ventilationSystem.normal();
        ventilationSystem.normalHumidity();
        soundSystem.off();
    }

    public void modeBackFromWork() {
        out.println("\nBACK FROM WORK MODE");
        lightSystem.normal();
        ventilationSystem.normal();
        ventilationSystem.normalHumidity();
        soundSystem.low();
        soundSystem.meditationMode();
    }

    public void modeParty() {
        out.println("\nPARTY MODE");
        lightSystem.low();
        ventilationSystem.cool();
        ventilationSystem.highHumidity();
        soundSystem.high();
        soundSystem.partyMode();
    }

    public void modeSleep() {
        out.println("\nSLEEP MODE");
        lightSystem.off();
        ventilationSystem.cool();
        ventilationSystem.lowHumidity();
        soundSystem.off();
        soundSystem.meditationMode();
    }

    public void modeVacation() {
        out.println("\nVACATION MODE");
        lightSystem.off();
        ventilationSystem.off();
        soundSystem.off();
    }
}
