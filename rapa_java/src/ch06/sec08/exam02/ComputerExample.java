package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		int sum = c.sum(1, 2, 3, 4, 5);
		System.out.println("합계: "+ sum);
		
		sum = c.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("합계: "+ sum);
	}

}
