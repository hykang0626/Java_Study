package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		System.out.println("모델명: "+myCar.model);
		System.out.println("시동여부: "+myCar.start);
		System.out.println("현재속도: "+myCar.speed);
		
		myCar.speed = 200;
		System.out.println("모델명: "+myCar.model);
		System.out.println("시동여부: "+myCar.start);
		System.out.println("현재속도: "+myCar.speed);
	}

}
