package com.udacity.microserviceDemo.microserviceDemo.repository;

import com.udacity.microserviceDemo.microserviceDemo.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
