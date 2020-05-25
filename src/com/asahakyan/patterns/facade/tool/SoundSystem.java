package com.asahakyan.patterns.facade.tool;

public class SoundSystem {

    public void off() {
        System.out.println("the sound is off");
    }

    public void low() {
        System.out.println("low sound");
    }

    public void normal() {
        System.out.println("normal sound");
    }

    public void high() {
        System.out.println("the sound is high");
    }

    public void meditationMode() {
        System.out.println("the equalizer is meditation");
    }

    public void partyMode() {
        System.out.println("the equalizer is party");
    }

    public void extraBassMode() {
        System.out.println("the equalizer is extra bass");
    }
}
