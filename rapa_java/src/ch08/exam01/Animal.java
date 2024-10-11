package ch08.exam01;

abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	abstract void sound(); //자식 클래스에서 구현 필요
	
	public void displayInfo() {
		System.out.println("Animal: " + name);
	}
}
