package com.javaStudy.ex;
import java.util.*;
public class DistanceNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수a :");
		int varA = scanner.nextInt();
		System.out.println("정수b :");
		int varB = scanner.nextInt();
		
		int distanceAB = (varA >= varB ? varA - varB :varB - varA );
		System.out.println((distanceAB >= 10 ? "두값의 차이는 10이상입니다." : "두값의 차이는 10미만입니다."));

		scanner.close();

	}

}
