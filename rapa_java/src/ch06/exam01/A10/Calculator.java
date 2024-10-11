package ch06.exam01.A10;

public class Calculator {
	public static final String Operation = "계산";
	
	public int calculate(int a, int b) {
		return 0;
	}
}

class Adder extends Calculator{
	public static final String Operation = "더하기";
	
	@Override
	public int calculate(int a, int b) {
		return a + b;
	}
}

class Multiplier extends Calculator{
	public static final String Operation = "곱하기";
	
	@Override
	public int calculate(int a, int b) {
		return a * b;
	}
	
}
