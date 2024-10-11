package ch13.sample;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<>();
		box1.setContent("홍길동");
		System.out.println(box1.getContent());
		
		Box<Integer> intBox = new Box<>();
		intBox.setContent(1234);
		System.out.println(intBox.getContent());
		
		
	}

}
