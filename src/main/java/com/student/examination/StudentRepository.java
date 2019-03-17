package com.student.examination;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<StudentVO, Long> {

	//List<StudentVO> findByStudentId(int studentId);	
}
