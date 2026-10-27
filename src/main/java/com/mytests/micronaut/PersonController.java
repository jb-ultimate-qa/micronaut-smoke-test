package com.mytests.micronaut;

import io.micronaut.context.event.ApplicationEventPublisher;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import java.util.List;


@Controller("/person")
public class PersonController {
    private final PersonRepository repo;
    private final ApplicationEventPublisher<PersonSearchedEvent> eventPublisher;

    public PersonController(PersonRepository repo,
                            ApplicationEventPublisher<PersonSearchedEvent> eventPublisher) {
        this.repo = repo;
        this.eventPublisher = eventPublisher;
    }

    @Get("/all")
    public List<Person> getAll() {

        return repo.findAll();
    }
    @Get("/byName/{name}")
    public List<Person> getByName(@PathVariable String name) {
        eventPublisher.publishEvent(new PersonSearchedEvent(name));
        return repo.customQuery1(name);
    }


}
