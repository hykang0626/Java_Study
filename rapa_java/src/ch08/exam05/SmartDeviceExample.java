package ch08.exam05;

public class SmartDeviceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice phone = new SmartPhone();
		phone.turnOn();
		phone.batteryStatus();
		phone.charge();
		phone.connectToWiFi();
		
		Communicable phoneCom = (Communicable) phone;
		phoneCom.sendMessage("Hello from phone!");
		phoneCom.receiveMessage();
		
		System.out.println();
		
		SmartDevice watch = new SmartWatch();
		watch.turnOn();
		watch.batteryStatus();
		watch.charge();
		watch.connectToWiFi();
		
		Communicable watchCom = (Communicable) watch;
		watchCom.sendMessage("Hello from watch!");
		watchCom.receiveMessage();
		
		System.out.println();
	}

}
