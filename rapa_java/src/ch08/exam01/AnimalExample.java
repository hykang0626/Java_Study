package ch08.exam01;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat("Kitty");
		cat.displayInfo();
		cat.sound();
		
		Animal dog = new Dog("Max");
		dog.displayInfo();
		dog.sound();
	}

}
