package ch08.exam05;

public class SmartPhone implements SmartDevice, Communicable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone is turning on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone is turning off");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone is charging");
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending message from SmartPhone: " + message);
		
	}

	@Override
	public void receiveMessage() {
		// TODO Auto-generated method stub
		System.out.println("Received message on SmartPhone: Message received");

	}

	@Override
	public void connectToWiFi() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone connected to WiFi");
	}

}
