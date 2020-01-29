package com.student.examination;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface StudentRepository extends CrudRepository<StudentVO, Long> {

	//List<StudentVO> findByStudentId(int studentId);	
	@Query("select s from StudentVO s where s.firstName=firstName")
	List<StudentVO> findByFirstName(@Param(value="firstName") String studentName);
	
	 @Query("select u from StudentVO u where u.lastName like ?1%")
	  List<StudentVO> findByAndSort(String lastname, Sort sort);
	
	@Query("select s from StudentVO s where s.id = :id")
	List<StudentVO> findStudentById(@Param(value="id")long id);
	
	
	
}
