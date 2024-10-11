package ch06.exam01.A09;

public class Animal {

	public static final String TYPE = "동물";
	
	public void makeSound() {
		System.out.println("이 동물은 소리를 냅니다.");
		
	}
	
}

class Dog extends Animal{
	public static final String Type = "개";
	
	@Override
	public void makeSound() {
		System.out.println("멍멍!");
	}
	
}

class Cat extends Animal {
	public static final String TYPE = "고양이";
	
	@Override
	public void makeSound() {
		System.out.println("야옹!");
	}
}