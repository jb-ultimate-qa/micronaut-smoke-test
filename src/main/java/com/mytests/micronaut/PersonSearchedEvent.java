package com.mytests.micronaut;

public class PersonSearchedEvent {
    private final String name;

    public PersonSearchedEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
