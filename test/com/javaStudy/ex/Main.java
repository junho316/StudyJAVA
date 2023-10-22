package com.javaStudy.ex;

public class Main {

	static int a = 1;
	static String str = "abc";
	
	public static void main(String[] args) {
	
		Test t1 = new Test();
		Main m1 = new Main();
		t1.sum();
		m1.print();


		boolean result = (str == t1.str3);
		System.out.print("result : " + result);
		
		

	}
	public void print() {
		//int value = 1;
		String str2 = "abc";
		boolean result1 = (str == str2);
		System.out.println("result1 : " + result1);
	}
	


}
class Test{
	 char c = 'a';
	 String str3 = "abc";
	 
	 
	 void sum() {
		 String str4 = "abc";
		 boolean result2 = (str3 == str4);
		 System.out.println("result2: "+ result2);
		 System.out.println(System.identityHashCode(str3));
		 str3 = "abcd";
		 System.out.println(System.identityHashCode(str3));
	 }
}
