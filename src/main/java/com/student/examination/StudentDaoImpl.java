package com.student.examination;

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl {
	  private final EntityManager em;

	  @Autowired
	  public StudentDaoImpl(JpaContext context) {
	    this.em = context.getEntityManagerByManagedType(StudentVO.class);
	  }
	public List<AddressVO> getAddressList(@Param(value="studentId") long id){
		
	
		TypedQuery<AddressVO> query
	      = em.createQuery("SELECT a FROM AddressVO a, StudentVO s WHERE a.studentVO.studentId =s.studentId", AddressVO.class);
	    List<AddressVO> resultList = query.getResultList();
		Stream<AddressVO> addressStream=resultList.stream();
		
	    addressStream.forEach(s->System.out.println(s.getAdressLine1()+","+s.getAdressLine2()));
		return resultList;
		
	}

}
