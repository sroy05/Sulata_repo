package com.student.examination;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamRepository examRepo;
	
	@Override
	public ExaminationVO getAllExamDetailsBySubjectId(long id) {
		ExaminationVO examinationList=examRepo.findById(id).get();
		// TODO Auto-generated method stub
		return examinationList;
	}
	
	@Transactional
	public List<ExaminationVO> getAllBySubName(String subjectName){
		return examRepo.findBySubjectName(subjectName);
		
	}

}
