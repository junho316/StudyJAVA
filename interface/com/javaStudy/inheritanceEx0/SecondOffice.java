package com.javaStudy.inheritanceEx0;

public class SecondOffice extends HeadOffice {
	
	@Override
	void jjajangmyeonPrice() {
		System.out.println("짜장면 - 5,000원");
	}
	
	@Override
	void jjamppongPrice() {
		System.out.println("짬뽕  - 5,000원");
	}
	@Override
	void tangsuyugPrice() {
		System.out.println("탕수육  - 10,000원");
	}
	
	@Override
	void gonggibabPrice() {
		System.out.println("공기밥  무료");
	}
}
