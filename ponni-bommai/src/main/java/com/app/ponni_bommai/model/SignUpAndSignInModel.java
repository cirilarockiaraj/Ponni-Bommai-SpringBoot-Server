package com.app.ponni_bommai.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SignUpAndSignInModel {

	@Id()
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private int id;

	@Column
	private String username;

	@Column
	private String emailId;

	@Column
	private String contactNo;

	public SignUpAndSignInModel() {
	}

	public SignUpAndSignInModel(String username, String emailId, String contactNo) {
		this.username = username;
		this.emailId = emailId;
		this.contactNo = contactNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}
