package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		
		System.out.println("총 보드 수: " + list.size());
		Board board = list.get(2);
		System.out.println("2번째 글: " + board);
		
		
		System.out.println("전체 목록------------------");
		for (Board b : list) {
			System.out.println(b);
		}
		
		list.remove(4);
		list.remove(board);
		
		System.out.println("전체 목록------------------");
		for (Board b : list) {
			System.out.println(b);
		}
	}
	
	

}
