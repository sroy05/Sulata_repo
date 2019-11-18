package com.student.examination;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<StudentVO> retrieveAll() {
		// TODO Auto-generated method stub
		return (List<StudentVO>) studentRepo.findAll();
		
		//return null;
	}

	@Override
	public StudentVO getStudentById(int id) {
		// TODO Auto-generated method stub
		StudentVO studentVO=null;
		if(id!=0) {
			 studentVO= studentRepo.findById(Long.valueOf(id)).get();
		}
		else {
			studentVO=null;
		}
		return studentVO;
	}

	@Override
	public boolean addStudent(StudentVO studentvo) {
		// TODO Auto-generated method stub
		if(null!=studentvo) {
			studentRepo.save(studentvo);
		}
		
		return true;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		StudentVO studentVO=null;
		if(id!=0) {
			 studentVO= studentRepo.findById(Long.valueOf(id)).get();
		}
		studentRepo.delete(studentVO);
		return true;
	}

	@Override
	public boolean updateStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StudentVO getStudentByname(String name) {
		// TODO Auto-generated method stub
		StudentVO studentVO=null;
		if(!name.equals(null)) {
			 studentVO= studentRepo.findByFirstName(name).get(0);
		}
		else {
			studentVO=null;
		}
		return studentVO;
	}

}
