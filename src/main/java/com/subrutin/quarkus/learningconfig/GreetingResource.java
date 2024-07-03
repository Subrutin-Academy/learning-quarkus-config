package com.subrutin.quarkus.learningconfig;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private final String message;

    public GreetingResource(@ConfigProperty(name="app.welcome-message") String message) {
        this.message = message;
    }
    

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.message;
    }
}
