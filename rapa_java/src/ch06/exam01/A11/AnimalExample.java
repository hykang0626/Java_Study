package ch06.exam01.A11;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.makeSound();
		cat.makeSound();
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Dog();
		
		for(Animal animal : animals) {
			animal.makeSound();
		}
		
		
	}

}
