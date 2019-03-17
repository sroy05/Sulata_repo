package com.student.examination;

import java.util.List;

public interface CustomExamRepository {
	List<ExaminationVO> getListByExamName(String examName);
	//List<ExaminationVO> getListByExamAndSubjectName(String examName,String subject);
	
	List<ExaminationVO> findByExamAndSubjectName( String examName,String subject);

}
