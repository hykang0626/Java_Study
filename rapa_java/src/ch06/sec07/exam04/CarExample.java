package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		//System.out.println("car1.company: "+ car1.company);
		print(car1);
		
		Car car2 = new Car("쏘나타");
		print(car2);
		
		Car car3 = new Car("쏘나타", "은색");
		print(car3);
		
	}
	
	public static void print(Car car) {
		System.out.println("company: " + car.company);
		System.out.println("model: " + car.model);
		System.out.println("color: " + car.color);
		System.out.println("maxspeed: " + car.maxSpeed);
		System.out.println("------------------------");
	}

}
