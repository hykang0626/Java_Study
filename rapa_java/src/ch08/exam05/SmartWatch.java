package ch08.exam05;

public class SmartWatch implements SmartDevice, Communicable {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SmartWatch is turning on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SmartWatch is turning off");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("SmartWatch is charging");
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending message from SmartWatch: " + message);
		
	}

	@Override
	public void receiveMessage() {
		// TODO Auto-generated method stub
		System.out.println("Received message on SmartWatch: Message received");

	}

	@Override
	public void connectToWiFi() {
		// TODO Auto-generated method stub
		System.out.println("SmartWatch connected to WiFi");
	}

}
