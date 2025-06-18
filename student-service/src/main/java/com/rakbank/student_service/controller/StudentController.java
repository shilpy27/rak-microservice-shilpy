package com.rakbank.student_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rakbank.student_service.entity.Student;
import com.rakbank.student_service.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping
	public ResponseEntity<Student> create(@RequestBody Student student) {
		return ResponseEntity.ok(service.save(student));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> get(@PathVariable String id) {
		return service.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping
	public List<Student> getAll() {
		return service.getAll();
	}
}
