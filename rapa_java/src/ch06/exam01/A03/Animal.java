package ch06.exam01.A03;

public class Animal {
	private String name;
	//생성자는 클래스이름이랑 public을 이용해서 만듦(?)
	public Animal(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.print(this.name+ "가 소리를 낸다");
	}
}
