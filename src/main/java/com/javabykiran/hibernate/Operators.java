package com.javabykiran.hibernate;
// Generated 30 Apr, 2020 11:50:30 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Operators generated by hbm2java
 */
@Entity
@Table(name = "operators", catalog = "loginspringmvcjbk")
public class Operators implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idoperators;
	private String person;
	private String for_;
	private String whatsapp;
	private String phonecall;
	private String sms;
	private String email;
	private String contact;
	private String timings;

	public Operators() {
	}

	public Operators(String person, String for_, String whatsapp, String phonecall, String sms, String email,
			String contact, String timings) {
		this.person = person;
		this.for_ = for_;
		this.whatsapp = whatsapp;
		this.phonecall = phonecall;
		this.sms = sms;
		this.email = email;
		this.contact = contact;
		this.timings = timings;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idoperators", unique = true, nullable = false)
	public Integer getIdoperators() {
		return this.idoperators;
	}

	public void setIdoperators(Integer idoperators) {
		this.idoperators = idoperators;
	}

	@Column(name = "person", nullable = false, length = 45)
	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	@Column(name = "for", nullable = false, length = 100)
	public String getFor_() {
		return this.for_;
	}

	public void setFor_(String for_) {
		this.for_ = for_;
	}

	@Column(name = "whatsapp", nullable = false, length = 45)
	public String getWhatsapp() {
		return this.whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	@Column(name = "phonecall", nullable = false, length = 45)
	public String getPhonecall() {
		return this.phonecall;
	}

	public void setPhonecall(String phonecall) {
		this.phonecall = phonecall;
	}

	@Column(name = "sms", nullable = false, length = 45)
	public String getSms() {
		return this.sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "contact", nullable = false, length = 45)
	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Column(name = "timings", nullable = false, length = 150)
	public String getTimings() {
		return this.timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "Operators [idoperators=" + idoperators + ", person=" + person + ", for_=" + for_ + ", whatsapp="
				+ whatsapp + ", phonecall=" + phonecall + ", sms=" + sms + ", email=" + email + ", contact=" + contact
				+ ", timings=" + timings + "]";
	}

}
