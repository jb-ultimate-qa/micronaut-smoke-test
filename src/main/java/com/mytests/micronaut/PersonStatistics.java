package com.mytests.micronaut;

import jakarta.inject.Singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
public class PersonStatistics {
    private final Map<String, Integer> searches = new ConcurrentHashMap<>();

    public void countSearch(String name) {
        searches.merge(name, 1, Integer::sum);
    }

    public int getSearchCount(String name) {
        return searches.getOrDefault(name, 0);
    }
}
