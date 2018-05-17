package com.example.demo.person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class PersonCommandLineRunner implements CommandLineRunner {

    private final PersonRepository repository;

    public PersonCommandLineRunner(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {       
        Stream.of("PersonA", "PersonB", "PersonC").forEach(name ->
                repository.save(new Person(name))
        );
        repository.findAll().forEach(System.out::println);
    }
}