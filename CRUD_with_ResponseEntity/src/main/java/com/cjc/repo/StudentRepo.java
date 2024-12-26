package com.cjc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
