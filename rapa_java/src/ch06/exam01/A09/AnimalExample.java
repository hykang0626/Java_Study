package ch06.exam01.A09;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		System.out.println("이 동물은 " + Dog.Type + "입니다.");
		dog.makeSound();
		System.out.println("이 동물은 " + Cat.TYPE + "입니다.");
		cat.makeSound();
	}

}
