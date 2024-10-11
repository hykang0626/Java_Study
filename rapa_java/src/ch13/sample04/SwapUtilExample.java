package ch13.sample04;

public class SwapUtilExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapUtil<String> su = new SwapUtil<>("공자", "맹자");
		System.out.println(su);
		su.swap();
		System.out.println(su);
		
		SwapUtil<Double> su2= new SwapUtil<>(3.14, 1.412);
		System.out.println(su2);
		su2.swap();
		System.out.println(su2);
	}

}
