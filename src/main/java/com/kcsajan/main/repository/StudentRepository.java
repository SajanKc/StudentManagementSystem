package com.kcsajan.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kcsajan.main.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {

}
