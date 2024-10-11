package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = {"java", "array", "copy"};
		
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); 
		//원본 , 복사 시작인덱스, 새배열, 붙여넣기 시작인덱스, 복사 항목수
		
		for(int i = 0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
		System.out.println();
		for(String item : newStrArray) {
			System.out.print(item + ", ");
		}
		
	}

}
