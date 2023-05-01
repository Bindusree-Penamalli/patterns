package com.bandiclasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiclasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
  List<Dog>findByName(String name);
}