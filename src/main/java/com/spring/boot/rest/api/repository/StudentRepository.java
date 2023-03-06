package com.spring.boot.rest.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.rest.api.model.Students;

public interface StudentRepository extends CrudRepository<Students,Integer> {

}
