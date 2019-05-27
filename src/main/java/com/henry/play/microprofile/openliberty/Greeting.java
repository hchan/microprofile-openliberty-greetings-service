package com.henry.play.microprofile.openliberty;

public class Greeting {

    private final String content;

    public Greeting() {
        content = null;
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
