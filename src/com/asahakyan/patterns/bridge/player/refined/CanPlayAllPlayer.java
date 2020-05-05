package com.asahakyan.patterns.bridge.player.refined;

import com.asahakyan.patterns.bridge.player.MusicPlayer;
import com.asahakyan.patterns.bridge.source.MusicSource;

import java.util.List;

public class CanPlayAllPlayer extends MusicPlayer {
    public CanPlayAllPlayer(List<MusicSource> sources) throws Exception {
        super(sources);
    }

    @Override
    public void showByGenre(String genre) {
        List<String> songs = getCurrentSource().findByGenre(genre);
        songs.forEach(System.out::println);
    }

    @Override
    public void play() {
        System.out.println(getCurrentSource().fetchMusic());
        // play the fetched source
    }

    @Override
    public void battery() {
        // works only with AC adapter, no batteries
    }
}
