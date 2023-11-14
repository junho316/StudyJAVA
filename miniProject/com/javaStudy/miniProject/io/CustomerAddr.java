package com.javaStudy.miniProject.io;

public class CustomerAddr extends Addr {

	private String customerName;
	private String itemName;
	private String rank;

	public CustomerAddr(String name, String phoneNumber, String email, String address, String group,
			String customerName, String itemName, String rank) {
		super(name, phoneNumber, email, address, group);
		this.customerName = customerName;
		this.itemName = itemName;
		this.rank = rank;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public void print() {
		System.out.println("이름\t:\t" + getName());
		System.out.println("전화번호\t:\t" + getPhoneNumber());
		System.out.println("이메일\t:\t" + getEmail());
		System.out.println("주소 \t:\t" + getAddress());
		System.out.println("그룹 \t:\t" + getGroup());
		System.out.println("거래처이름 \t:\t" + customerName);
		System.out.println("품목이름\t:\t" + itemName);
		System.out.println("직책\t:\t" + rank);
		System.out.println("-----------------");
	}
}
