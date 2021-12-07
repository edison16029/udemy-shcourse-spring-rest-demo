package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;
	
	//define @PostConstruct to load the student data, this is called only once, during Bean Initialisation
	
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<Student>();
		
		theStudents.add(new Student("Edison", "Moni"));
		theStudents.add(new Student("Lionel", "Messi"));
		theStudents.add(new Student("Lebron", "James"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return theStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		return theStudents.get(studentId);
	}
}
