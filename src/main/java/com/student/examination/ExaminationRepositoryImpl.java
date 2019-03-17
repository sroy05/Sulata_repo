/*package com.student.examination;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

@Component("ExamRepository")
@Transactional
public class ExaminationRepositoryImpl<ExaminationVO, Long  extends Serializable> extends SimpleJpaRepository<ExaminationVO, Long>
implements ExamRepository<ExaminationVO, Long> {


	private EntityManager entityManager;
	 
    public <T> ExaminationRepositoryImpl(JpaEntityInformation<ExaminationVO, ?> 
      entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }
    
	
	@Override
	public List<ExaminationVO> getListByExamName(String examName) {
		// TODO Auto-generated method stub
		CriteriaBuilder criteria=entityManager.getCriteriaBuilder();
		CriteriaQuery<ExaminationVO> cquery=criteria.createQuery(getDomainClass());
		Root<ExaminationVO> root=cquery.from(getDomainClass());
		cquery.select(root).where(criteria
		        .like(root.<String>get(examName), "%"));
		TypedQuery<ExaminationVO> query = entityManager.createQuery(cquery);
		return query.getResultList();
	}

	@Override
	public List<ExaminationVO> findByExamAndSubjectName(String examName, String subject) {
		// TODO Auto-generated method stub
		CriteriaBuilder criteria=entityManager.getCriteriaBuilder();
		CriteriaQuery<ExaminationVO> cquery=criteria.createQuery(getDomainClass());
		Root<ExaminationVO> root=cquery.from(getDomainClass());
		cquery.select(root).where(criteria
		        .like(root.<String>get(examName), "%"+(subject)+"%"));
		TypedQuery<ExaminationVO> query = entityManager.createQuery(cquery);
		return query.getResultList();
	}
	

	
}
*/