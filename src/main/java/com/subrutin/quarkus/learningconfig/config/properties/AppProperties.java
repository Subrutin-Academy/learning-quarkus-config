package com.subrutin.quarkus.learningconfig.config.properties;

import java.time.Duration;

import com.subrutin.quarkus.learningconfig.converter.DurationConverter;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithConverter;

@ConfigMapping(prefix="app")
public interface AppProperties {

    public String welcomeMessage();

    public String currency();

    public String timezone();

    @WithConverter(DurationConverter.class)
    public Duration timeout();

}
