package com.javaStudy.miniProject.io;

public class CompanyAddr extends Addr {

	private String companyName;
	private String department;
	private String rank;

	public CompanyAddr(String name, String phoneNumber, String email, String address, String group, String companyName,
			String department, String rank) {
		super(name, phoneNumber, email, address, group);
		this.companyName = companyName;
		this.department = department;
		this.rank = rank;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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
		System.out.println("회사이름 \t:\t" + companyName);
		System.out.println("부서이름\t:\t" + department);
		System.out.println("직책\t:\t" + rank);
		System.out.println("-----------------");
	}
}
