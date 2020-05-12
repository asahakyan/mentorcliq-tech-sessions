package com.asahakyan.patterns.bridge;

import com.asahakyan.patterns.bridge.player.MusicPlayer;
import com.asahakyan.patterns.bridge.player.refined.CanPlayAllPlayer;
import com.asahakyan.patterns.bridge.player.refined.CdPlayer;
import com.asahakyan.patterns.bridge.source.MusicSource;
import com.asahakyan.patterns.bridge.source.impl.CdSource;
import com.asahakyan.patterns.bridge.source.impl.TapeSource;
import com.asahakyan.patterns.bridge.source.impl.UsbSource;
import com.asahakyan.runner.PatternRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BridgeRunner implements PatternRunner {
    @Override
    public void run() {
        try {
            System.out.println("---multiple source example with adding Tape after init---");
            List<MusicSource> initialSource = new ArrayList<MusicSource>();
            initialSource.add(new UsbSource());
            initialSource.add(new CdSource());

            MusicPlayer multiSourcePlayer = new CanPlayAllPlayer(initialSource);
            System.out.println("SHOULD SHOW USB FETCHING");
            multiSourcePlayer.play();
            multiSourcePlayer.changeToNextSource();
            System.out.println("\nSHOULD SHOW CD FETCHING");
            multiSourcePlayer.play();
            multiSourcePlayer.changeToNextSource();
            System.out.println("\nSHOULD SHOW USB ROCK SONGS");
            multiSourcePlayer.showByGenre("rOck");

            System.out.println("\nADD NEW TAPE SOURCE");
            multiSourcePlayer.addNewSource(new TapeSource());
            multiSourcePlayer.changeToNextSource();
            multiSourcePlayer.changeToNextSource();
            System.out.println("SHOULD SHOW TAPE FETCHING");
            multiSourcePlayer.play();
            System.out.println("\nSHOULD SHOW TAPE SONGS LIST");
            multiSourcePlayer.showByGenre("rock");

            System.out.println("\n---specific single source example - CD player---");
            MusicPlayer cdPlayer = new CdPlayer(new CdSource());
            System.out.println("SHOULD SHOW CD FETCHING");
            cdPlayer.play();
            System.out.println("\nSHOULD NOT CHANGE THE SOURCE AND SHOW CD FETCHING");
            cdPlayer.changeToNextSource();
            cdPlayer.play();
            cdPlayer.battery();

            System.out.println("\n---broken source example---");
            System.out.println("SHOULD THROW EXCEPTION");
            MusicPlayer brokenPlayer = new CanPlayAllPlayer(Collections.emptyList());
            brokenPlayer.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
