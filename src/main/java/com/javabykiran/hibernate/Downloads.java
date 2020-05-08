package com.javabykiran.hibernate;
// Generated 1 May, 2020 12:07:45 PM by Hibernate Tools 5.2.12.Final

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Downloads generated by hbm2java
 */
@Entity
@Table(name = "downloads", catalog = "loginspringmvcjbk")
public class Downloads implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int iddownloads;
	private byte[] name;
	private String vender;
	private String softwareversion;
	private String bit32;
	private String bit64;
	private String common;
	private String officialSource;

	public Downloads() {
	}

	public Downloads(int iddownloads, byte[] name, String vender, String softwareversion, String bit32, String bit64,
			String common, String officialSource) {
		this.iddownloads = iddownloads;
		this.name = name;
		this.vender = vender;
		this.softwareversion = softwareversion;
		this.bit32 = bit32;
		this.bit64 = bit64;
		this.common = common;
		this.officialSource = officialSource;
	}

	@Id
	@GeneratedValue
	@Column(name = "iddownloads", unique = true, nullable = false)
	public int getIddownloads() {
		return this.iddownloads;
	}

	public void setIddownloads(int iddownloads) {
		this.iddownloads = iddownloads;
	}

	@Column(name = "name", nullable = false)
	public byte[] getName() {
		return this.name;
	}

	public void setName(byte[] name) {
		this.name = name;
	}

	@Column(name = "vender", nullable = false, length = 85)
	public String getVender() {
		return this.vender;
	}

	public void setVender(String vender) {
		this.vender = vender;
	}

	@Column(name = "softwareversion", nullable = false, length = 45)
	public String getSoftwareversion() {
		return this.softwareversion;
	}

	public void setSoftwareversion(String softwareversion) {
		this.softwareversion = softwareversion;
	}

	@Column(name = "bit32", nullable = false, length = 115)
	public String getBit32() {
		return this.bit32;
	}

	public void setBit32(String bit32) {
		this.bit32 = bit32;
	}

	@Column(name = "bit64", nullable = false, length = 115)
	public String getBit64() {
		return this.bit64;
	}

	public void setBit64(String bit64) {
		this.bit64 = bit64;
	}

	@Column(name = "Common", nullable = false, length = 151)
	public String getCommon() {
		return this.common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	@Column(name = "Official_Source", nullable = false, length = 100)
	public String getOfficialSource() {
		return this.officialSource;
	}

	public void setOfficialSource(String officialSource) {
		this.officialSource = officialSource;
	}

	@Override
	public String toString() {
		return "Downloads [iddownloads=" + iddownloads + ", name=" + Arrays.toString(name) + ", vender=" + vender
				+ ", softwareversion=" + softwareversion + ", bit32=" + bit32 + ", bit64=" + bit64 + ", common="
				+ common + ", officialSource=" + officialSource + "]";
	}

}
