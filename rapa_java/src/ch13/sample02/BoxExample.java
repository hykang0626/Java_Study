package ch13.sample02;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer, String> box1 = new Box<>(10, "홍길동");
		System.out.println(box1);
		
		Box<Double, Boolean> box2 = new Box<>(3.14, true);
		System.out.println(box2);
	}

}
