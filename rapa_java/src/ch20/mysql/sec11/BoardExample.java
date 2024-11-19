package ch20.mysql.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BoardExample {
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	public BoardExample() {		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sf", "root", "1234");
		} catch(Exception e) {
			e.printStackTrace(); exit();
		}
		finally {}
	}
	public void boardlist() {
//		[게시판 목록]
//		------------------------------
//		no  writer    date     title
//		1   홍길동   2014-12-01  환영합니다.
		System.out.println();
		System.out.println("[게시판 목록]");
		System.out.println("----------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		
		//board 목록 읽어오기
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards; ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				System.out.printf("%-6s%-12s%-16s%-40s\n",
						board.getBno(), 
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle()
						);

				
			} rs.close();
		} catch (Exception e) {
			
		}finally {
//			pstmt.close();
		}
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("[메인메뉴] 1.생성 | 2.읽기 | 3.지우기 | 4. 종료");
		System.out.print("메뉴선택: ");
		String menuNo = scanner.nextLine();
		System.out.println("선택된번호: " + menuNo);
		
		switch (menuNo) {
		case "1":
			create();
			break;
		case "2":
			read();
			break;
		case "3":
			clear();
			break;
		case "4":
			exit();
			break;
		}
	}
	private void create() {
		System.out.println("게시물 생성실행.............");
		//제목
		//글쓴이
		//날짜
		//내용
		Board board = new Board();
		System.out.print("제목: ");
		board.setBtitle(scanner.nextLine());
		System.out.print("글쓴이: ");
		board.setBwriter(scanner.nextLine());
		System.out.print("내용: ");
		board.setBcontent(scanner.nextLine());
		
		//DB에 저장
		try {
			String sql = "INSERT INTO boards(btitle, bwriter, bcontent, bdate)"
					+"values(?, ?, ?, now());";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  board.getBtitle());
			pstmt.setString(2,  board.getBwriter());
			pstmt.setString(3,  board.getBcontent());
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch(Exception e) {
			
		}finally {
		}

		
		boardlist();
	}
	private void read() {
		System.out.println("읽기실행.............");
		System.out.print("bno:");
		String temp = scanner.nextLine();
		int bno = Integer.parseInt(temp);
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards WHERE bno = ?; ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("################");
				System.out.println("번호:" + rs.getInt("bno"));
				System.out.println("제목:" + rs.getString("btitle"));
				System.out.println("내용:" + rs.getString("bcontent"));
				System.out.println("작성자:" + rs.getString("bwriter"));
				System.out.println("날짜:" + rs.getDate("bdate"));
				System.out.println("################");
			}else {
				System.out.printf("게시판 번호 %d는 자료가 없습니다. \n", bno);
			}
			
			System.out.println("계속하시려면 아무키나 누르세요....");
			String _temp = scanner.nextLine();
			
		} catch(Exception e) {
			
		}finally {}
		
		
		boardlist();
	}
	private void clear() {
		System.out.println("지우기실행...........");
		System.out.print("bno:");
		String temp = scanner.nextLine();
		int bno = Integer.parseInt(temp);
		try {
			String sql = "delete from boards WHERE bno = ?; ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			int rows = pstmt.executeUpdate();
			if(rows > 0) {
				System.out.println("삭제 성공");
				
			}else {
				System.out.println("삭제 실패");
			}
			
			System.out.println("계속하시려면 아무키나 누르세요....");
			String _temp = scanner.nextLine();
			
		} catch(Exception e) {
			
		}finally {}
		boardlist();
	}
	private void exit() {
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardExample bde = new BoardExample();
		bde.boardlist();
	}

}
