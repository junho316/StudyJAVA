package com.javaStudy.nestedClassEx3;

public class Anonymous {

	Person field = new Person() {
		void work() {
			System.out.println("일하러 갑니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	};

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책하러 갑니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다");
				walk();
			}
		};
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}
