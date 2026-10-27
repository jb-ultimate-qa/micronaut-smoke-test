package com.mytests.micronaut;

import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;

@Singleton
public class PersonSearchListener {

    @EventListener
    public void onPersonSearched(PersonSearchedEvent event) {
        System.out.println("Person searched: " + event.getName());
    }
}
