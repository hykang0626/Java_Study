package ch08.exam03;

public class ElectronicDeviceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice tv = new SmartTV();
		tv.turnOn();
		tv.connectToInternet();
		tv.turnOff();
		
		SmartDevice phone = new SmartPhone();
		phone.turnOn();
		phone.connectToInternet();
		phone.turnOff();
		
	}

}
