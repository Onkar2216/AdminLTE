package com.javabykiran.hibernate;
// Generated 29 Apr, 2020 1:08:42 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Links generated by hbm2java
 */
@Entity
@Table(name = "links", catalog = "loginspringmvcjbk")
public class Links implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idLinks;
	private String content;
	private String click;

	public Links() {
	}

	public Links(String content, String click) {
		this.content = content;
		this.click = click;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idLinks", unique = true, nullable = false)
	public Integer getIdLinks() {
		return this.idLinks;
	}

	public void setIdLinks(Integer idLinks) {
		this.idLinks = idLinks;
	}

	@Column(name = "content", nullable = false, length = 150)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "click", nullable = false, length = 100)
	public String getClick() {
		return this.click;
	}

	public void setClick(String click) {
		this.click = click;
	}

	@Override
	public String toString() {
		return "Links [idLinks=" + idLinks + ", content=" + content + ", click=" + click + "]";
	}

}
