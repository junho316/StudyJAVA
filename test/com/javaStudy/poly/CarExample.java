package com.javaStudy.poly;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for (int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 타이어 한국타이어로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 타이어 금호타이어로 교체");
				car.frontRightTire = new Tire("앞오른쪽", 15);
				break;
			case 3:
				System.out.println("뒤 왼쪽 타이어 한국타이어로 교체");
				car.backLefTire = new HankookTire("뒤 왼쪽", 15);
				break;
			case 4:
				System.out.println("앞왼쪽 타이어 금호타이어로 교체");
				car.backRighTire = new KumhoTire("뒤오른", 15);
				break;
			default:
				break;
			}
			System.out.println("-------------------------");
		}
		
		
	}

}
