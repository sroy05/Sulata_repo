package com.student.examination;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;


public interface ExamRepository
extends JpaRepository<ExaminationVO, Long> {

	//@Query("select e from ExaminationVO e where e.examName = :examName")
	//List<ExaminationVO> getListByExamName(String examName);
	//List<ExaminationVO> getListByExamAndSubjectName(String examName,String subject);
	
	//List<ExaminationVO> findByExamAndSubjectName( String examName,String subject);
	
	/*@Query("select e from ExaminationVO e where e.studentID = :studentID")
	List<ExaminationVO> findByStudentId(@Param("studentID")Long studentID);*/
	@Query("select e from ExaminationVO e where e.subject = :subject")
	List<ExaminationVO> findBySubjectName(@Param(value="subject")String subject);
	
}
