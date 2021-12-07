package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents() {
		
		List<Student> theStudents = new ArrayList<Student>();
		
		theStudents.add(new Student("Edison", "Moni"));
		theStudents.add(new Student("Lionel", "Messi"));
		theStudents.add(new Student("Lebron", "James"));
		return theStudents;
	}
}
