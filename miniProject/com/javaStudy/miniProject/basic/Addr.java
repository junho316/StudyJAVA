package com.javaStudy.miniProject.basic;

public class Addr {

	private String name;
	private String phoneNumber;
	private String address;
	private String group;
	private String email;

	public Addr(String name, String phoneNumber, String address, String group, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.group = group;
		this.email = email;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
