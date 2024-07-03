package com.subrutin.quarkus.learningconfig.converter;

import java.time.Duration;

import org.eclipse.microprofile.config.spi.Converter;

public class DurationConverter implements  Converter<Duration> {

    @Override
    public Duration convert(String value) throws IllegalArgumentException, NullPointerException {
       return Duration.parse(value);
    }

}
