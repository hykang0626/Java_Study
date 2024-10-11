package ch06.check;

public class Printer {
	//static을 붙이면 printer 객체를 생성하지 않고 메소드를 호출할 수 있음.
	//static을 안붙이면 Printer.println(value)해야함.
	void println(int value) {
		System.out.println(value);
	}
	void println(boolean value) {
		System.out.println(value);
	}
	void println(double value) {
		System.out.println(value);
	}
	void println(String value) {
		System.out.println(value);
	}
}
