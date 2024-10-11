package ch06.exam01.A05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.setName("강호연");
		System.out.println("이름 : " + person.getName());
		
		person.setAge(26);
		System.out.println("나이 : " + person.getAge());
	}

}
