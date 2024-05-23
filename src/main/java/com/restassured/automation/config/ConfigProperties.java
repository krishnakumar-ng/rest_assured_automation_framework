package com.restassured.automation.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigCache;

public interface ConfigProperties extends Config {
    ConfigProperties CONFIG_PROPERTIES = ConfigCache.getOrCreate(ConfigProperties.class);

    @Key("config")
    String config();
}