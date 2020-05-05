package com.javabykiran.hibernate;
// Generated 1 May, 2020 7:37:48 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "loginspringmvcjbk")
public class Users implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idusers;
	private State state;
	private String username;
	private String mobile;
	private String email;
	private String courses;
	private String gender;
	private String password;
	private int idregistration;
	private String isDefault="Y";

	public Users() {
	}

	public Users(State state, String username, String mobile, String email, String courses, String gender,
			String password, int idregistration, String isDefault) {
		this.state = state;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.courses = courses;
		this.gender = gender;
		this.password = password;
		this.idregistration = idregistration;
		this.isDefault = isDefault;
	}

	public Users(int iduser, State state, String username, String mobile, String email, String courses,
			String gender, String password, int idregistration, String isDefault) {
		this.idusers=iduser;
		this.state = state;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
		this.courses = courses;
		this.gender = gender;
		this.password = password;
		this.idregistration = idregistration;
		this.isDefault = isDefault;	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idusers", unique = true, nullable = false)
	public Integer getIdusers() {
		return this.idusers;
	}

	public void setIdusers(Integer idusers) {
		this.idusers = idusers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sid", nullable = false)
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Column(name = "username", nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "mobile", nullable = false, length = 45)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email", nullable = false, length = 55)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "courses", nullable = false, length = 85)
	public String getCourses() {
		return this.courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	@Column(name = "gender", nullable = false, length = 45)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "idregistration", nullable = false)
	public int getIdregistration() {
		return this.idregistration;
	}

	public void setIdregistration(int idregistration) {
		this.idregistration = idregistration;
	}

	@Column(name = "isDefault", nullable = false, length = 45)
	public String getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "Users [idusers=" + idusers + ", state=" + state + ", username=" + username + ", mobile=" + mobile
				+ ", email=" + email + ", courses=" + courses + ", gender=" + gender + ", password=" + password
				+ ", idregistration=" + idregistration + ", isDefault=" + isDefault + "]";
	}

}