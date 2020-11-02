package com.kcsajan.main.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.kcsajan.main.repository.StudentRepository;

public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

}
