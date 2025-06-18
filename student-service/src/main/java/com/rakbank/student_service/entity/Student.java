package com.rakbank.student_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private String studentId;
	private String studentName;
	private String grade;
	private String mobileNumber;
	private String schoolName;
}
