package ch08.exam02;

public interface Vehicle {
	void start();
	void stop();
	
	default void fuelStatus() {
		System.out.println("Fuel level is normal");
	}
}
