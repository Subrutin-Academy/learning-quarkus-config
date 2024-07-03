package com.subrutin.quarkus.learningconfig;

import com.subrutin.quarkus.learningconfig.config.properties.AppProperties;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    private AppProperties appProperties;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return appProperties.welcomeMessage()+" "+appProperties.currency()+" "+appProperties.timezone() +" "+appProperties.timeout().toSeconds();
    }
}
