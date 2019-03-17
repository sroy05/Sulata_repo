package com.student.examination;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="examination")

public class ExaminationVO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SUBJECT_ID")
	private long subjectId;

	@Column(name="EXAM_NAME")
	private String examName;
	@Column(name="SUBJECT")
	private String subject;
	@Column(name="SCORE")
	private int score;
	@Column(name="ACTUAL_MARK")
	private int fullmark;
	@Column(name="PASSMARK")
	private int passMark;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STUDENT_ID")
	private StudentVO studentvo;
	
	
	
	
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public StudentVO getStudentvo() {
		return studentvo;
	}
	public void setStudentvo(StudentVO studentvo) {
		this.studentvo = studentvo;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public int getFullmark() {
		return fullmark;
	}
	public void setFullmark(int fullmark) {
		this.fullmark = fullmark;
	}
	public int getPassMark() {
		return passMark;
	}
	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}
	
	
	
	
	
	
}
