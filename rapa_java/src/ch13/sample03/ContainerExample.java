package ch13.sample03;

public class ContainerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Container<Integer> intContainer = new Container<>();
        intContainer.setItem(123);
        System.out.println("Integer Value: " + intContainer.getItem());  // 출력: Integer Value: 123

        // String 타입의 Container 생성
        Container<String> stringContainer = new Container<>();
        stringContainer.setItem("Hello, World!");
        System.out.println("String Value: " + stringContainer.getItem());  // 출력: String Value: Hello, World!

        // Double 타입의 Container 생성
        Container<Double> doubleContainer = new Container<>();
        doubleContainer.setItem(3.14);
        System.out.println("Double Value: " + doubleContainer.getItem());  // 출력: Double Value: 3.14
	}

}
