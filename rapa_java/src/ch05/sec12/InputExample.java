package ch05.sec12;

import java.util.Scanner;
public class InputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 입력 :nextLine, 숫자 입력 : nextInt
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력");
		String strBuffer = scan.nextLine();
		System.out.println("당신이 입력한 값은 [" + strBuffer +"]입니다.");
		
		System.out.print("첫번째 숫자 입력");
		int intBuffer1 = scan.nextInt();
		System.out.print("두번째 숫자 입력");
		int intBuffer2 = scan.nextInt();
		System.out.println("당신이 입력한 값의 합은 [" + (intBuffer2+intBuffer1) +"]입니다.");
		
	}

}
