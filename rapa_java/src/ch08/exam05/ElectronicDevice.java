package ch08.exam05;

public interface ElectronicDevice {
	void turnOn();
	void turnOff();
	
	default void batteryStatus() {
		System.out.println("Battery level is sufficient");
	}
}
