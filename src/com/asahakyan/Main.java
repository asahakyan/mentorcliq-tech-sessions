package com.asahakyan;

import com.asahakyan.runner.Pattern;

import static com.asahakyan.runner.PatternRunnerFactory.createPatternRunner;

public class Main {

    public static void main(String[] args) {
        createPatternRunner(Pattern.ABSTRACT_FACTORY).run();
    }

}
