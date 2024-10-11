package ch06.exam01.A07;

public class Student {
	private String name;
	private String id;
	private int score;
	private String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void calculateGrade() {
		if (this.score >= 60) {
			if (this.score>=70) {
				if (this.score >= 80) {
					if (this.score >= 90) {
						this.grade = "A";
					}
					else {
						this.grade ="B";
					}
				}
				else {
					this.grade="C";
				}
			}
			else {
				this.grade = "D";
			}
			
		} 
		else {
			this.grade = "F";
		}
		
		
	}
	
	
	
	
}
