package com.asahakyan.patterns.bridge.source;

import java.util.List;

public interface MusicSource {
    String fetchMusic();

    List<String> findByGenre(String genre);
}
