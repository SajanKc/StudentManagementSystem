package com.kcsajan.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Student")
public class Student {

	@Id
	private Integer id;

	private Integer rollNo;

	private String fname;

	private String lname;

	private String address;

	private Gender gender;

	private String email;

	private Long phone;

	public Student() {

	}

	public Student(Integer id, Integer rollNo, String fname, String lname, String address, Gender gender, String email,
			Long phone) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", fname=" + fname + ", lname=" + lname + ", address="
				+ address + ", gender=" + gender + ", email=" + email + ", phone=" + phone + "]";
	}

}
