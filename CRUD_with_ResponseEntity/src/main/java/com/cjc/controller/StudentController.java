package com.cjc.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/addstudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student s) {
		Student stud = studentService.addStudent(s);
		ResponseEntity<Student> re = new ResponseEntity<Student>(stud, HttpStatus.OK);
		return re;
	}

	@GetMapping("/getstudent/{rollno}")
	public ResponseEntity<Student> getStudentByRollno(@PathVariable int rollno) {
		Student stud = studentService.getStudent(rollno);
		ResponseEntity<Student> re = new ResponseEntity<Student>(stud, HttpStatus.OK);
		return re;

	}

	@GetMapping("/getallstudent")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> ls = studentService.getAllStudent();
		ResponseEntity<List<Student>> re = new ResponseEntity<List<Student>>(ls, HttpStatus.OK);
		return re;

	}
	
	@PutMapping("/updatestudent")
	public ResponseEntity<Student> updateStudent(@RequestBody Student s) {
		Student stud = studentService.updateStudent(s);
		ResponseEntity<Student> re = new ResponseEntity<Student>(stud, HttpStatus.OK);
		return re;

	}
	
	@DeleteMapping("/deletestudent/{rollno}")
	public ResponseEntity<Student> deleteStudentByRollno(@PathVariable int rollno) {
		studentService.deleteStudent(rollno);
		ResponseEntity<Student> re = new ResponseEntity<Student>(HttpStatus.OK);
		return re;

	}
 

}
