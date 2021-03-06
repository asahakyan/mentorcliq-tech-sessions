package com.asahakyan.runner;

import com.asahakyan.homework.game.GameHomework;
import com.asahakyan.patterns.abstract_factory.AbstractFactoryRunner;
import com.asahakyan.patterns.adapter.AdapterRunner;
import com.asahakyan.patterns.bridge.BridgeRunner;
import com.asahakyan.patterns.decorator.DecoratorRunner;
import com.asahakyan.patterns.facade.FacadeRunner;
import com.asahakyan.patterns.factory_method.FactoryMethodRunner;
import com.asahakyan.patterns.strategy.StrategyRunner;
import com.asahakyan.patterns.template_method.TemplateMethodRunner;

public class PatternRunnerFactory {

    public static PatternRunner createPatternRunner(Pattern pattern) {
        switch (pattern) {
            case STRATEGY:
                return new StrategyRunner();
            case ADAPTER:
                return new AdapterRunner();
            case BRIDGE:
                return new BridgeRunner();
            case FACADE:
                return new FacadeRunner();
            case DECORATOR:
                return new DecoratorRunner();
            case TEMPLATE_METHOD:
                return new TemplateMethodRunner();
            case FACTORY_METHOD:
                return new FactoryMethodRunner();
            case ABSTRACT_FACTORY:
                return new AbstractFactoryRunner();
            case GAMEHOMEWORK:
                return new GameHomework();
            default:
                throw new RuntimeException("Unknown pattern " + pattern);
        }
    }

}
