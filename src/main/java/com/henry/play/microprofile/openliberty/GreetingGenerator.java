package com.henry.play.microprofile.openliberty;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@RequestScoped
public class GreetingGenerator {

    //@Inject
    //@ConfigProperty(name = "greeting.message")
    //private String message; // does NOT work ... sigh ... ConfigProperties behave differently than Thorntail
    public Greeting generate(String name) {
   
        return new Greeting("Hello From Open Liberty");
    }
}
