package ch06.exam01.A05;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
		else {
			System.out.println("나이는 0보다 커야 합니다.");
		}
	}
	
	
}
