package com.javaStudy.nestedClassEx3;

public class Main {

	public static void main(String[] args) {

		Anonymous anonymous = new Anonymous();
		anonymous.field.wake();
		
		
		anonymous.method1();

		anonymous.method2(
			new Person() {
				void study() {
					System.out.println("공부하러 갑니다.");
				}

				@Override
				void wake() {
					System.out.println("9시에 일어납니다");
					study();
				}
			}
		);
	}

}
