package ch20.mysql.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileInputStream;

public class ConnectionExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sf","root","1234");
			System.out.println("mysql연결성공");
			//사용자추가--
//			String sql = "INSERT INTO users (userid, username, userpassword, userage, useremail)"
//					+ "VALUES(?,?,?,?,?);";
////			+ "VALUES('tiger','호랑이','1234',12,'tiger@gmail.com');";
//			
//			PreparedStatement  pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "lion");
//			pstmt.setString(2, "사자");
//			pstmt.setString(3, "1234");
//			pstmt.setInt(4, 30);
//			pstmt.setString(5, "lion@naver.com");
			//게시글 쓰기
//			String sql = "INSERT INTO boards(btitle,bcontent,bwriter,bdate,bfilename,bfiledata) "
//					+ "VALUES(?,?,?, NOW(),?,?); ";
//			PreparedStatement  pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//			pstmt.setString(1, "비트코인상승세");
//			pstmt.setString(2, "미 대선후 비트코인의 상승이 대세이다.");
//			pstmt.setString(3, "호랑이");
//			pstmt.setString(4, "bitcoin.jpg");
//			pstmt.setBlob(5,new FileInputStream("src/ch20/mysql/sec05/bitcoin.jpg") );		

			//게시글 수정
//			String sql = "UPDATE boards  "
//					+ "SET "
//					+ "btitle = ?, "
//					+ "bcontent = ? "
//					+ "WHERE bno = ? ;";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "환율상승과 무역수지");
//			pstmt.setString(2, "미 대선결과 국제 자금이 미국으로 이동하기시작하였고, 대미 환률이 연일 최고치를 기록하고 있다");
//			pstmt.setInt(3, 4);
			
			//게시글 삭제
//			String sql = "DELETE FROM boards WHERE bno = ?;";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, 4);	
//			
			int rows = pstmt.executeUpdate();
			if(rows>0) {
//				ResultSet rs = pstmt.getGeneratedKeys();
//				if(rs.next()) {
//					int bno = rs.getInt(1);
//					System.out.println("번호:"+bno);
//				}
				
				System.out.println("저장성공");
			} else {
				System.out.println("저장실패");
			}
			
			//게시글 읽기 (직접)
//			String sql = "SELECT userid, username, userpassword, userage, useremail FROM users";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				String userid = rs.getString("userid");
//				String username = rs.getString(2);
//				String userpassword = rs.getString(3);
//				int userage = rs.getInt(4);
//				String useremail = rs.getString("useremail");				
//				System.out.println(userid+ username+ userpassword+ userage+ useremail);
//			}

			//게시글 읽기 (DTO)
//			String sql = "SELECT userid, username, userpassword, userage, useremail FROM users";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			while(rs.next()) {
//				User user = new User();
//				user.setUserId(rs.getString("userid"));
//				user.setUserName(rs.getString(2));
//				user.setUserPassword(rs.getString(3));
//				user.setUserAge(rs.getInt(4));
//				user.setUserEmail(rs.getString("useremail"));				
//				System.out.println(user);
//			}	
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("mysql연결끊기");
				} catch(Exception e) {}
			}
			
		}

	}

}