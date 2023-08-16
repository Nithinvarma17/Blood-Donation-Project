package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Donor {
	@Column(name="full_name")
	private String fullName;
	@Column(name="blood_group")
	private String bloodGroup;
	@Column(name="mobile_no")
	private String mobileNo;
	@Column(name="country")
	private String country;
	@Column(name="state")
	private String state;
	@Column(name="district")
	private String district;
	@Column(name="city")
	private String city;
	@Column(name="emailid")
	private String emailId;
	@Id
	private int userId;
	@Column(name="password")
	private String password;
	@Column(name="retype_password")
	private String reTypepassword;
	@Column(name="confirm")
	private String confirm;
	public Donor(String fullName, String bloodGroup, String mobileNo, String country, String state, String district,
			String city, String emailId, int userId, String password, String reTypepassword, String confirm) {
		super();
		this.fullName = fullName;
		this.bloodGroup = bloodGroup;
		this.mobileNo = mobileNo;
		this.country = country;
		this.state = state;
		this.district = district;
		this.city = city;
		this.emailId = emailId;
		this.userId = userId;
		this.password = password;
		this.reTypepassword = reTypepassword;
		this.confirm = confirm;
	}
	public Donor() {}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReTypepassword() {
		return reTypepassword;
	}
	public void setReTypepassword(String reTypepassword) {
		this.reTypepassword = reTypepassword;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	
	
	
}
