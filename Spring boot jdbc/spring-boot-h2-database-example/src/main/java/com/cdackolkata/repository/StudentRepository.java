package com.cdackolkata.repository;

import org.springframework.data.repository.CrudRepository;

import com.cdackolkata.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
