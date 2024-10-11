package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		set.add("spring");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator(); //전체 순회
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		System.out.println();
		for (String element : set) {
			System.out.println(element);
		}
	}

}
