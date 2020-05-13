package com.asahakyan.homework.game.singleton;

public class ConfigurationLoader {

    private ConfigurationLoader() {

    }

    private static class ConfigurationLoaderHelper {
        private static final ConfigurationLoader INSTANCE = new ConfigurationLoader();
    }

    public static ConfigurationLoader getInstance() {
        return ConfigurationLoaderHelper.INSTANCE;
    }

    public void loadConfiguration() {
        System.out.println("Configuration has been successfully loaded!");
    }

    public void saveConfiguration() {
        System.out.println("Configuration has been successfully saved!");
    }
}
