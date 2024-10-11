package ch13.sample02;

public class Box<T, U> {
	private T item1;
	private U item2;
	public Box(T item1, U item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getItem1() {
		return item1;
	}
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	public U getItem2() {
		return item2;
	}
	public void setItem2(U item2) {
		this.item2 = item2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Box (item1: " + this.item1 + ", item2: " + this.item2 + ")";
	}
	
	
	
	
}
