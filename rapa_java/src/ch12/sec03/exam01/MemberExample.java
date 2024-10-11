package ch12.sec03.exam01;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("blue");
		Member m2 = new Member("blue");
		Member m3 = new Member("red");
		Member m4 = m2;
		//♥
		
		System.out.println(m1 == m2);
		System.out.println(m2 == m4);
		System.out.println(m1.equals(m2));
	}

}
