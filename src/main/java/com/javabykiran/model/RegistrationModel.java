package com.javabykiran.model;

public class RegistrationModel 
{
	private int idregistration;
	private String name;
	private String mobile;
	private String email;
	private String password;
	public int getIdregistration() {
		return idregistration;
	}
	public void setIdregistration(int idregistration) {
		this.idregistration = idregistration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "RegistrationModel [idregistration=" + idregistration + ", name=" + name + ", mobile=" + mobile
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
}
