package com.javaStudy.ex;
import java.util.Random;;
public class RamdomThree {

	public static void main(String[] args) {
		Random rand = new Random();
		int test = rand.nextInt(3);
		
		System.out.println("컴퓨터가 낸것은 :");
		switch (test) {
		case 0:
			System.out.print("가위");
			break;
		case 1:
			System.out.print("바위");
			break;
		case 2:
			System.out.print("보");
			break;			
		default:
			System.out.print("에러");
		}
		
	}

}
