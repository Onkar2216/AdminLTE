package com.javabykiran.model;

import com.javabykiran.hibernate.State;

public class AddUserModel 
{
	private int iduser;
	private String username;
	private String mobile;
	private String email;
	private String courses;
	private String gender;
	private String password;
	private int idregistration;
	private State state;
	private String isDefault="N";
	
	
	
	public AddUserModel(int iduser, String username, String mobile, String email, String courses, String gender,
			String password, int idregistration,State state) {
		super();
		this.iduser = iduser;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.courses = courses;
		this.gender = gender;
		this.password = password;
		this.idregistration = idregistration;
		this.state=state;
		
	}
	
	public AddUserModel(int iduser, String username, String mobile, String email, String courses, String gender,
			String password, int idregistration, State state,String isDefault) {
		super();
		this.iduser = iduser;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.courses = courses;
		this.gender = gender;
		this.password = password;
		this.idregistration = idregistration;
		this.state=state;
		this.isDefault=isDefault;
	}
	
	public AddUserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdregistration() {
		return idregistration;
	}
	public void setIdregistration(int idregistration) {
		this.idregistration = idregistration;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "AddUserModel [iduser=" + iduser + ", username=" + username + ", mobile=" + mobile + ", email=" + email
				+ ", courses=" + courses + ", gender=" + gender + ", password=" + password
				+ ", idregistration=" + idregistration + ", state=" + state + ", isDefault=" + isDefault + "]";
	}
}
