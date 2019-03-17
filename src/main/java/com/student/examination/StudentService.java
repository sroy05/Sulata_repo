package com.student.examination;

import java.util.List;

import org.springframework.stereotype.Component;


public interface StudentService {
	
	List<StudentVO> retrieveAll();
	StudentVO getStudentById(int id);
	boolean addStudent(StudentVO studentvo);
	boolean deleteStudent(int id);
	boolean updateStudent(int id);

}
