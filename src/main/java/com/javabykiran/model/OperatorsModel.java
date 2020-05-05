package com.javabykiran.model;

public class OperatorsModel {
	
	private Integer idoperators;
	private String person;
	private String for_;
	private String whatsapp="false";
	private String phonecall="false";
	private String sms="false";
	private String email="false";
	private String contact;
	private String timings;
	
	public OperatorsModel(Integer idoperators, String person, String for_, String whatsapp, String phonecall,
			String sms, String email, String contact, String timings) {
		super();
		this.idoperators = idoperators;
		this.person = person;
		this.for_ = for_;
		this.whatsapp = whatsapp;
		this.phonecall = phonecall;
		this.sms = sms;
		this.email = email;
		this.contact = contact;
		this.timings = timings;
	}

	public Integer getIdoperators() {
		return idoperators;
	}

	public void setIdoperators(Integer idoperators) {
		this.idoperators = idoperators;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getFor_() {
		return for_;
	}

	public void setFor_(String for_) {
		this.for_ = for_;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getPhonecall() {
		return phonecall;
	}

	public void setPhonecall(String phonecall) {
		this.phonecall = phonecall;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "OperatorsModel [idoperators=" + idoperators + ", person=" + person + ", for_=" + for_ + ", whatsapp="
				+ whatsapp + ", phonecall=" + phonecall + ", sms=" + sms + ", email=" + email + ", contact=" + contact
				+ ", timings=" + timings + "]";
	}
	
	

}
