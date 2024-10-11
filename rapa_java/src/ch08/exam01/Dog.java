package ch08.exam01;

public class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	
	@Override
	void sound() {
		System.out.println("Bark");
	}
}
