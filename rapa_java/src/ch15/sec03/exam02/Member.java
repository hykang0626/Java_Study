package ch15.sec03.exam02;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}
	
	

}
