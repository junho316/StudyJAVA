package com.javaStudy.cla;

public class Main {

	public static void main(String[] args) {

		Member2 member1 = new Member2("장준호", "010-1111-1111", "컴퓨터", 2, "aa@naver.com");
		Member2 member2 =  new Member2("이재서", "010-2222-2222", "컴퓨터", 3, "bb@naver.com", "1998-10-13", "서울");

		member1.print();
		member2.print();
	}
}

class Member2{
	String name;	
	String phoneNumber;
	String major;
	int grade;
	String email;
	String birth;
	String address;
	
	Member2(String name, String phoneNumber, String major, int grade, String email) {
		this(name, phoneNumber, major, grade, email, "정보 없음", "정보 없음");
	}
	
	Member2(String name, String phoneNumber, String major, int grade, String email, String birth, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.major = major;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}
	
	void print(){
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("이메일 : " + email);
		System.out.println("생일 : " + birth);
		System.out.println("주소 : " + address);
		System.out.println("----------------------");
	}
}
