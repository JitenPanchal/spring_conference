package com.pluralsight.conference.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Info {

	private String id;
	private String message;
	private boolean isSuccess;
	private Address homeAddress;

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Info() {
		super();
	}

	public Info(String id, String message, boolean isSuccess) {
		super();
		this.id = id;
		this.message = message;
		this.isSuccess = isSuccess;
	}

	public Info(String id, String message, boolean isSuccess, Address homeAddress) {
		super();
		this.id = id;
		this.message = message;
		this.isSuccess = isSuccess;
		this.homeAddress = homeAddress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
