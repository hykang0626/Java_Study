package ch05.page201;
import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		 
		int option;
		int numStudent = 0;
		int[] scoreArray = {};
		int max = -1;
		int sum = 0;
		
		
		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료" );
			System.out.println("--------------------------------------------");
			
			System.out.print("선택> ");
			option = scan.nextInt();
			
			if (option == 1) {
				numStudent = scan.nextInt();
			}
			
			else if (option == 2) {
				scoreArray = new int[numStudent];
				for (int i = 0 ; i < numStudent; i++) {
					System.out.print("Scores[" + i + "]>");
					int score = scan.nextInt();
					scoreArray[i] = score;
				}
				
			}
			else if (option == 3) {
				for (int i = 0; i < scoreArray.length; i++) {
					System.out.println("Scores["+ i + "]: "+scoreArray[i]);
				}
			}
			else if (option == 4) {
				for (int i = 0; i < scoreArray.length; i++) {
					if (max < scoreArray[i]) {
						max = scoreArray[i];
						
					}
					sum += scoreArray[i];
				}
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + (sum/scoreArray.length));
			}
			else if (option == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}
		
	}

}
