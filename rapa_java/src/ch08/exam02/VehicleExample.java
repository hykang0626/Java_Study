package ch08.exam02;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car();
		car.start();
		car.fuelStatus();
		car.stop();
		
		Vehicle bicycle = new Bicycle();
		bicycle.start();
		bicycle.fuelStatus();
		bicycle.stop();
	}

}
