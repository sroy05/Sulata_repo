package com.student.examination;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STUDENT_ID")
	private long studentId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="BIRTHDATE")
	private Date birthDate;
	@Column(name="SCHL_NAME")
	private String schoolName;
	@Column(name="STANDARD")
	private String standard;
	@Column(name="ROLL_NO")
	private int rollNo;
	
	@OneToMany(
			mappedBy="studentvo",	
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	    private List<ExaminationVO> comments = new ArrayList<>();
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	

	
}
