package com.asahakyan.patterns.bridge.source.impl;

import com.asahakyan.patterns.bridge.source.MusicSource;

import java.util.Collections;
import java.util.List;

public class CdSource implements MusicSource {
    @Override
    public String fetchMusic() {
        return "fetched from CD";
    }

    @Override
    public List<String> findByGenre(String genre) {
        switch (genre) {
            case "classic":
                return List.of("Symphony N9");
            default:
                return Collections.emptyList();
        }
    }
}
