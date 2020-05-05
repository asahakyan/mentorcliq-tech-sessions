package com.asahakyan.patterns.bridge.player.refined;

import com.asahakyan.patterns.bridge.player.MusicPlayer;
import com.asahakyan.patterns.bridge.source.impl.CdSource;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CdPlayer extends MusicPlayer {
    public CdPlayer(CdSource source) throws Exception {
        super(Collections.singletonList(source));
    }

    @Override
    public void showByGenre(String genre) {
        List<String> songs = getCurrentSource().findByGenre(genre);
        songs.forEach(System.out::println);
    }

    @Override
    public void play() {
        System.out.println("I play from CD with great quality");
        System.out.println(getCurrentSource().fetchMusic());
        // play the fetched source
    }

    @Override
    public void battery() {
        System.out.println("Current battery level is: " + (int) (Math.random() * 100));
    }
}
