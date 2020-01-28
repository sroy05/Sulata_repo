package com.student.examination;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("example-unit");;
	public List<AddressVO> getAddressList(@Param(value="studentId") long id){
		
		 EntityManager em = entityManagerFactory.createEntityManager();
		TypedQuery<AddressVO> query
	      = em.createQuery("SELECT d FROM AddressVO a, StudentVO s WHERE a.studentvo.studentId =s.studentId", AddressVO.class);
	    List<AddressVO> resultList = query.getResultList();
		Stream<AddressVO> addressStream=resultList.stream();
		
	    addressStream.forEach(System.out::println);
		return resultList;
		
	}

}
