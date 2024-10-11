package ch08.exam03;

public class SmartTV implements SmartDevice {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV is turning on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV is turning off");
	}

	@Override
	public void connectToInternet() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV is connecting to the internet");

	}

}
