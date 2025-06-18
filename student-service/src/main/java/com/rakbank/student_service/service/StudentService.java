package com.rakbank.student_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakbank.student_service.entity.Student;
import com.rakbank.student_service.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student save(Student student) {
		return repository.save(student);
	}

	public Optional<Student> getById(String studentId) {
		return repository.findById(studentId);
	}

	public List<Student> getAll() {
		return repository.findAll();
	}
}
