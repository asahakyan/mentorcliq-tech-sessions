package com.asahakyan.patterns.runner;

import com.asahakyan.patterns.adapter.AdapterRunner;
import com.asahakyan.patterns.bridge.BridgeRunner;
import com.asahakyan.patterns.strategy.StrategyRunner;

public class PatternRunnerFactory {

    public static PatternRunner createPatternRunner(Pattern pattern) {
        switch (pattern) {
            case STRATEGY:
                return new StrategyRunner();
            case ADAPTER:
                return new AdapterRunner();
            case BRIDGE:
                return new BridgeRunner();
            default:
                throw new RuntimeException("Unknown pattern " + pattern);
        }
    }

}
