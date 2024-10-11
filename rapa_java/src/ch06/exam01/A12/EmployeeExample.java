package ch06.exam01.A12;

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee full = new FullTimeEmployee("홍길동");
		PartTimeEmployee part = new PartTimeEmployee("김철수", 15.0, 120);
		
		System.out.println(full.getName() + "의 급여: " + full.calculateSalary());
		System.out.println(part.getName() + "의 급여: " + part.calculateSalary());
	}

}
