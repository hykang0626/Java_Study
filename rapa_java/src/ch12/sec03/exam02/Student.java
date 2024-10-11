package ch12.sec03.exam02;

import java.util.Objects;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
		
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return this.no;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(this.no == target.no && target.name.equals(this.name)) {
				return true;
			}

		}
		return false;
	}
	
	
	
}
