package com.javaStudy.referenceType;

public class ArrayReference {

	public static void main(String[] args) {
	
		String[] strArr = new String[3];
		strArr[0] = "JAVA";
		strArr[1] = "JAVA";
		strArr[2] = new String( "JAVA");
		
		System.out.println(strArr[0] ==strArr[1]);
		System.out.println(strArr[0] ==strArr[2]);
		System.out.println(strArr[0].equals(strArr[2]));
		
	}

}
