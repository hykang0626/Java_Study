package ch13.sample04;

public class SwapUtil<T> {
	private T item1;
	private T item2;
	
	public SwapUtil(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
		
	}
	public void swap() {
		T temp = item1;
		item1 = item2;
		item2 = temp;
		
	}
	
	@Override 
	public String toString() {
		return "(" +item1 +", "+ item2 + ")";
	}
	
}
