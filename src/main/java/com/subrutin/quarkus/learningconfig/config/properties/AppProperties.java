package com.subrutin.quarkus.learningconfig.config.properties;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix="app")
public interface AppProperties {

    public String welcomeMessage();

    public String currency();

    public String timezone();

}
