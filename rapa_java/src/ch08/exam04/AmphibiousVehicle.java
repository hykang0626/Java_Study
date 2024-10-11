package ch08.exam04;

public class AmphibiousVehicle implements Flyable, Swimmable {

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("The vehicle is flying");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The vehicle is swimming");
	}

}
