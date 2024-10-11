package ch12.sec04;

public class NanoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long beginTime = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long endTime = System.nanoTime();
		System.out.println("합: " + sum);
		System.out.println((endTime - beginTime) + "나노초");
	}

}
