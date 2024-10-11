package ch06.exam01.A06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setBrand("현대");
		car.setSpeed(80);
		
		System.out.println("브랜드: "+ car.getBrand() +", 속도: " + car.getSpeed() );
	}

}
