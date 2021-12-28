package com.example.demo.repository;

import com.example.demo.collection.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface RepositoryPerson extends ReactiveMongoRepository<Person, String> {

    Mono<Person> findByName(String nombre);
}
