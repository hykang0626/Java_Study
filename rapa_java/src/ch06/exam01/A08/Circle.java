package ch06.exam01.A08;

public class Circle {
	
	private double radius;
	private static final double PI = 3.14;
	private String color;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * PI;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor(){
		return color;
	}
	
}

//package ch06.exam01.A08;
//
//public class Circle {
//	
//	private double radius;
//	private static final double PI = 3.14;
//	private String color;
//	
//	public Circle(double radius) {
//		this.radius = radius;
//	}
//	
//	public double getArea(double radius, double PI) {
//		return radius * radius * PI;
//	}
//	
//	public double getPerimeter(double radius, double PI) {
//		return 2 * radius * PI;
//	}
//	
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	public String getColor(){
//		return color;
//	}
//	
//}

