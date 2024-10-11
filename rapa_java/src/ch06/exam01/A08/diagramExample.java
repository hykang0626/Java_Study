package ch06.exam01.A08;

import java.util.Scanner;

public class diagramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Circle 객체 생성
        System.out.print("Enter radius for Circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.print("Enter color for Circle: ");
        scanner.nextLine();  // 줄바꿈 문자 처리
        String circleColor = scanner.nextLine();
        circle.setColor(circleColor); // 색상 설정

        // Rectangle 객체 생성
        System.out.print("Enter width for Rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Enter height for Rectangle: ");
        double rectangleHeight = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);
        System.out.print("Enter color for Rectangle: ");
        scanner.nextLine();  // 줄바꿈 문자 처리
        String rectangleColor = scanner.nextLine();
        rectangle.setColor(rectangleColor); // 색상 설정

        // 도형 정보 출력
        System.out.println("\nCircle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        scanner.close(); // 스캐너 닫기
	}

}
