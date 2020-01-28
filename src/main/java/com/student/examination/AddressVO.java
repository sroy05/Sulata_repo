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
@Table(name="address")
public class AddressVO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	@Column(name="city")
	private String city;
	@Column(name="AddressLine1")
	private String adressLine1;
	@Column(name="AddressLine2")
	private String adressLine2;
	@Column(name="state")
	private String state;
	@Column(name="zipcode")
	private int zipcode;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="student_id")
	private StudentVO studentVO;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdressLine1() {
		return adressLine1;
	}
	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}
	public String getAdressLine2() {
		return adressLine2;
	}
	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
