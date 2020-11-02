package com.kcsajan.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kcsajan.main.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
