package com.javabykiran.model;

public class DownloadsModel 
{
	private int iddownloads;
	private String version;
	private String base64Image;
	private String vender;
	private String bit32;
	private String bit64;
	private String common;
	private String officialSource;
	
	
	
	public DownloadsModel() {
		super();
	}

	public DownloadsModel(int iddownloads, String version, String base64Image, String vender, String bit32,
			String bit64, String common, String officialSource) {
		super();
		this.iddownloads = iddownloads;
		this.version = version;
		this.base64Image = base64Image;
		this.vender = vender;
		this.bit32 = bit32;
		this.bit64 = bit64;
		this.common = common;
		this.officialSource = officialSource;
	}

	public int getIddownloads() {
		return iddownloads;
	}

	public void setIddownloads(int iddownloads) {
		this.iddownloads = iddownloads;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBase64Image() {
		return base64Image;
	}

	public void setBase64Image(String base64Image) 
	{
		this.base64Image = base64Image;
	}

	public String getVender() {
		return vender;
	}

	public void setVender(String vender) 
	{
		this.vender = vender;
	}

	public String getBit32() 
	{
		return bit32;
	}

	public void setBit32(String bit32) 
	{
		this.bit32 = bit32;
	}

	public String getBit64() 
	{
		return bit64;
	}

	public void setBit64(String bit64) 
	{
		this.bit64 = bit64;
	}

	public String getCommon() 
	{
		return common;
	}

	public void setCommon(String common) 
	{
		this.common = common;
	}

	public String getOfficialSource() 
	{
		return officialSource;
	}

	public void setOfficialSource(String officialSource) {
		this.officialSource = officialSource;
	}

	@Override
	public String toString() {
		return "DownloadsModel [iddownloads=" + iddownloads + ", version=" + version + ", base64Image=" + base64Image
				+ ", vender=" + vender + ", bit32=" + bit32 + ", bit64=" + bit64 + ", common=" + common
				+ ", officialSource=" + officialSource + "]";
	}
}
