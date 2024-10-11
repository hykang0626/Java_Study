package ch08.exam03;

public class SmartPhone implements SmartDevice {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone is turning on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhon is turning off");
	}

	@Override
	public void connectToInternet() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone is connecting to the internet");

	}

}
