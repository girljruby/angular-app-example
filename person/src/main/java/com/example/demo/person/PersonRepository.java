package com.example.demo.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
interface PersonRepository extends JpaRepository<PersonRepository, Long> {

	//Object save(Person person);
}

