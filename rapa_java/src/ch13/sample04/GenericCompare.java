package ch13.sample04;

public class GenericCompare {
	public static <T> boolean compare(T a, T b) {
		return a.equals(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 3;
		Double b = 3.0;
		System.out.println(compare(a, b));
		
	}

}
