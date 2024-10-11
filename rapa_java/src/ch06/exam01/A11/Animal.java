package ch06.exam01.A11;

public class Animal {
	public void makeSound() {
		System.out.println("소리를 냅니다.");
	}
}

class Dog extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("야옹");
	}
}

