package com.pluralsight.conference.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.pluralsight.conference.validators.Password;

public class UserDetails {

	@NotNull(message = "firstName can not be null")
	@Size(min = 2, message = "firstname must have atleast 2 chars")
	private String firstName;

	@NotNull(message = "lastName can not be null")
	private String lastName;

	@NotNull(message = "email can not be null")
	private String email;

	@NotNull(message = "password can not be null")
	@Password(message = "Invalid password")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}