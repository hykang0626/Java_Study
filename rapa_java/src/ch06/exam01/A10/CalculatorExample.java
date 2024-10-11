package ch06.exam01.A10;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator adder = new Adder();
		Calculator multi = new Multiplier();
		
		System.out.println("연산 종류: " + Adder.Operation);
		System.out.println("결과: " + adder.calculate(5, 3));
		
		System.out.println("연산 종류: " + Multiplier.Operation);
		System.out.println("결과: " + multi.calculate(5, 3));
		
	}

}
