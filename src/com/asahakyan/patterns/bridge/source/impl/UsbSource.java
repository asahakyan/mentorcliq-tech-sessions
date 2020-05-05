package com.asahakyan.patterns.bridge.source.impl;

import com.asahakyan.patterns.bridge.source.MusicSource;

import java.util.Collections;
import java.util.List;

public class UsbSource implements MusicSource {
    @Override
    public String fetchMusic() {
        return "fetched from USB";
    }

    @Override
    public List<String> findByGenre(String genre) {
        if (genre.equalsIgnoreCase("rock")) {
            return List.of("Hells Bells", "Stairways to Heaven", "Time", "Echos", "Kashmir", "I love rock n roll");
        } else {
            return Collections.emptyList();
        }
    }
}
