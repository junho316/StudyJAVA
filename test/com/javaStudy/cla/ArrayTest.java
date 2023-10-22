package com.javaStudy.cla;

public class ArrayTest {

	public static void main(String[] args) {

		ArrayMember[] members = new ArrayMember[5];
		
		members[0] =  new ArrayMember(1, "aaa", "박지성");
		members[1] =  new ArrayMember(2, "bbb", "차두리");
		members[2] =  new ArrayMember(3, "ccc", "손흥민");
		members[3] =  new ArrayMember(4, "ddd", "이영웅");
		members[4] =  new ArrayMember(5, "eee", "영탁");
		
		for (int i = 0; i < members.length; i ++) {
			System.out.println(members[i].memberNo + "번 회원 아이디는 " +
							 members[i].memberId + "이고,이름은 " + 
							 members[i].memberName + "입니다.");
		}
	}

}
