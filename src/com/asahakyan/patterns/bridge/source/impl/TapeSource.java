package com.asahakyan.patterns.bridge.source.impl;

import com.asahakyan.patterns.bridge.source.MusicSource;

import java.util.Collections;
import java.util.List;

public class TapeSource implements MusicSource {
    @Override
    public String fetchMusic() {
        return "fetched from TAPE";
    }

    @Override
    public List<String> findByGenre(String genre) {
        // I don't have the list of my songs :(
        return Collections.emptyList();
    }
}
