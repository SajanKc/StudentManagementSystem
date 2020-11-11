package com.kcsajan.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kcsajan.main.model.Student;
import com.kcsajan.main.repository.StudentRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping(value = "/student")
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@GetMapping(value = "/student/{id}")
	public Optional<Student> getStudent(@PathVariable long id) {
		return studentRepository.findById(id);
	}

	@PostMapping(value = "/addstudent")
	public String saveStudent(@RequestBody Student student) {
		Student addedStudent = studentRepository.save(student);
		return "Student " + addedStudent.getFname() + " " + addedStudent.getLname() + " Added To The Database.";
	}

//	@PutMapping("/updatestudent/{id}")
//	public ResponseEntity<Student> update(@RequestBody Student student, @PathVariable long id) {
//		try {
//			studentRepository.save(student);
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (NoSuchElementException e) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}

	@DeleteMapping(value = "/student/{id}")
	public String deleteStudent(@PathVariable long id) {
		studentRepository.deleteById(id);
		return "Student With id : " + id + " Deleted From Database.";
	}
}
