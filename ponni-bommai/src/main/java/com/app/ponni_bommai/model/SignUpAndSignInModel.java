package com.app.ponni_bommai.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class SignUpAndSignInModel {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	@NotBlank(message = "Please enter the username")
	private String username;

	@Column
	@Email(message = "Invalid email ID")
	private String emailId;

	@Column
	@Size(min = 10 , max = 10, message = "Invalid contact number")
	private String contactNo;
	
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
