package com.asahakyan.patterns;

import com.asahakyan.patterns.runner.Pattern;

import static com.asahakyan.patterns.runner.PatternRunnerFactory.createPatternRunner;

public class Main {

    public static void main(String[] args) {
        createPatternRunner(Pattern.BRIDGE).run();
    }

}
