package com.novasoft.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@Column(length = 64, nullable = false)
	private String name;
	
	@Column(length = 64, nullable = false)
	private String firstname;
	
	@Column(length = 64)
	private String password;
	
	@Column(length = 64)
	private String email;
	
	@Column(nullable = false, unique = true)
	private String telNum;
	
	
	
	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}


//	
	
	protected User() {
		super();
	}


	
	public User(String name, String firstname, String password, String email, String telNum) {
	super();
	this.name = name;
	this.firstname = firstname;
	this.password = password;
	this.email = email;
	this.telNum = telNum;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	


	
	
}
