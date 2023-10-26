package com.javaStudy.nestedClass;

public class A {

	interface Q {

	}

	public A() {
		System.out.println("A 객체 생성");
	}

	class B {
		public B() {
			System.out.println("B 개체 생성");
		}

		int field1;

		void method1() {
		}

	}

	static class C {
		public C() {
			System.out.println("C 객체 생성");
		}

		int field1;

		void method1() {
		}

		static int field2;

		static void method2() {
		}
	}

	void method() {
		class D {
			public D() {
				System.out.println("D 객체 생성");
			}

			int field1;

			void method1() {
			}

		}

		D d = new D();
		d.field1 = 3;
		d.method1();
		System.out.println("D field1 " + d.field1);
	}
}
