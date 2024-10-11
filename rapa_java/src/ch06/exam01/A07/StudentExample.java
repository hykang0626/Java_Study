package ch06.exam01.A07;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student();
		
		stud.setName("강호연");
		stud.setId("2");
		stud.setScore(75);
		stud.calculateGrade();
		
		System.out.println("이름: " + stud.getName());
		System.out.println("ID: " + stud.getId());
		System.out.println("점수: " + stud.getScore());
		System.out.println("성적: " + stud.getGrade());
		
		
	}

}
