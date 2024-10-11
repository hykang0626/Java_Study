package ch13.sample04;

public class Utility {
	public static <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.println(element);
		}
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr = {1, 2, 3};
		String[] strArr = {"C#", "JAVA", "PYTHON"};
		printArray(intArr);
		printArray(strArr);
	}

}
