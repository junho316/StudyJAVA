package com.javaStudy.nestedClass;

public class Addr {

	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String group;

	public Addr(String name, String phoneNumber, String email, String address, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.group = group;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public void print() {
		System.out.println("이름\t:\t" + name);
		System.out.println("전화번호\t:\t" + phoneNumber);
		System.out.println("이메일\t:\t" + email);
		System.out.println("주소 \t:\t" + address);
		System.out.println("그룹 \t:\t" + group);
		System.out.println("-----------------");
	}
}
