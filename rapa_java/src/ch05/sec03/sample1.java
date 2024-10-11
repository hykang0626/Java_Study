package ch05.sec03;

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		System.out.println(arr1 ==arr2);
		System.out.println(arr2 == arr3);
		String str1 ="홍길동";
		String str2 = new String("홍길동");// new를 사용하면 재활용을 하지 않고 새로 만들어버림
		String str3 = str2;
		System.out.println(str1 ==str2);
		System.out.println(str2 == str3);
		
	}

}
