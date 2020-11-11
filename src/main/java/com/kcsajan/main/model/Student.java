package com.kcsajan.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student {

	@Id
	private long _id;

	private int rollNo;

	private String fname;

	private String lname;

	private String address;

	private String gender;

	private String email;

	private long phone;

	public Student() {
		super();
	}

	public Student(long _id, int rollNo, String fname, String lname, String address, String gender, String email,
			long phone) {
		super();
		this._id = _id;
		this.rollNo = rollNo;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		this._id = id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
