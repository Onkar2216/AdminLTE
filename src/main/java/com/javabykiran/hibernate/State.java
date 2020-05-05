package com.javabykiran.hibernate;
// Generated 1 May, 2020 7:37:48 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * State generated by hbm2java
 */
@Entity
@Table(name = "state", catalog = "loginspringmvcjbk")
public class State implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer sid;
	private String statename;
	//private Set<Users> userses = new HashSet<>(1);

	public State() {
	}

	public State(String statename/* , Set<Users> userses */) {
		this.statename = statename;
		//this.userses = userses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sid", unique = true, nullable = false)
	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@Column(name = "statename", length = 45)
	public String getStatename() {
		return this.statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	/*
	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	 public Set<Users> getUserses() 
	 {
		 return this.userses; 
	 }
	 
	 public void setUserses(Set<Users> userses) 
	 {
		 this.userses = userses; 
	}
	*/
	
	@Override
	public String toString() {
		return "State [sid=" + sid + ", statename=" + statename + /* ", userses=" + userses + */"]";
	}
	
}
