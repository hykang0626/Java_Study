package ch15.sec02.exam01;

public class Board {
	private String subject;
	private String content;
	private String writter;
	
	public Board(String subject, String content, String writter) {
		this.subject = subject;
		this.content = content;
		this.writter = writter;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWritter() {
		return writter;
	}

	public void setWritter(String writter) {
		this.writter = writter;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "제목: " + this.subject + ", 내용: " + this.content + ", 작성자: " + this.writter;
	}
	

}
