package com.cjc.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repo.StudentRepo;
import com.cjc.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo sr;

	@Override
	public Student addStudent(Student s) {
		Student stud = sr.save(s);
		return stud;
	}

	@Override
	public Student getStudent(int rollno) {
		Optional<Student> s= sr.findById(rollno);
		if(s!=null) {
			return s.get();
		}
		return null;
		
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> ls = sr.findAll();
		return ls;
	}

	@Override
	public Student updateStudent(Student s) {
		Optional<Student> stu=sr.findById(s.getRollno());
		if(!stu.isEmpty()) {
			stu.get().setName(s.getName());
			stu.get().setCourse(s.getCourse());
			sr.save(stu.get());
			return stu.get();
		}
		return null;
	}

	@Override
	public void deleteStudent(int rollno) {
		sr.deleteById(rollno);
	}

}
