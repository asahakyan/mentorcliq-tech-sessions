package com.asahakyan.patterns.bridge.player;

import com.asahakyan.patterns.bridge.source.MusicSource;

import java.util.List;

public abstract class MusicPlayer {
    private List<MusicSource> musicSources;
    private int currentSourceIndex;

    protected MusicPlayer(List<MusicSource> sources) throws Exception {
        if (sources.isEmpty()) {
            throw new Exception("Can't find any music source. Please check that input devices are connected.");
        }
        this.musicSources = sources;
        this.currentSourceIndex = 0;
    }

    protected MusicSource getCurrentSource() {
        return this.musicSources.get(this.currentSourceIndex);
    }

    public void changeToNextSource() {
        if (this.currentSourceIndex == this.musicSources.size() - 1) {
            this.currentSourceIndex = 0;
        } else {
            this.currentSourceIndex++;
        }
    }

    public void addNewSource(MusicSource newSource) {
        this.musicSources.add(newSource);
    }

    abstract public void showByGenre(String genre);

    abstract public void play();

    abstract public void battery();

}
