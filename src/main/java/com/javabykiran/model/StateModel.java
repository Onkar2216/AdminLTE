package com.javabykiran.model;

public class StateModel 
{
	private int sid;
	private String statename;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	@Override
	public String toString() {
		return "StateModel [sid=" + sid + ", statename=" + statename + "]";
	}
	
	
}
