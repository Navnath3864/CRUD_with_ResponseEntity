package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentService {

	Student addStudent(Student s);

	Student getStudent(int rollno);

	List<Student> getAllStudent();

	Student updateStudent(Student s);

	List<Student> deleteStudent(int rollno);

}
