package ch06.exam01.A12;

public class Employee {
	public static final double BASE_SALARY = 3000.0;
	public static final double BONUS_RATE = 0.2;
	
	private String name;
	
	public Employee(String name){
		this.name = name;
	}
	
	public double calculateSalary() {
		return 0.0;
	}
	
	public String getName() {
		return name;
	}
}

class FullTimeEmployee extends Employee{
	public FullTimeEmployee (String name) {
		super(name);
	}
	
	@Override
	public double calculateSalary() {
		return BASE_SALARY + (BASE_SALARY * BONUS_RATE); 
	}
	
}

class PartTimeEmployee extends Employee{
	private double hourlyRate;
	private int hoursWorked;
	
	public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
}

