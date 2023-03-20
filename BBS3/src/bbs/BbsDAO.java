package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	private Connection conn;
	private ResultSet rs;
	
	//실제로 mysql에 접속하게 해주는 부분
	public BbsDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/BBS?serverTimezone=UTC";
			String dbID = "yujin";
			String dbPassword = "1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(dbURL, dbID, dbPassword);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//게시판 글쓰기 총 3개함수 필요
	//1. 시간을 가져오는 함수
	public String getDate() {
		String SQL = "SELECT NOW()";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL); //여러개 함수가 충돌되지않도록 함수 안에 작성해줌
			rs=pstmt.executeQuery(); //쿼리문 결과 여기에 저장
			if (rs.next()) {
				return rs.getString(1); //날짜 그대로 반환가능하도록 함
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return ""; //데이터베이스 오류
	}
	
	//2.bbsID 가져오기(게시글 번호) 내림차순을 해서 마지막번호의 1을 더한값이 다음값이 되겠지 그걸위해 만들어줌
	public int getNext() {
		String SQL = "SELECT bbsID FROM BBS ORDER BY bbsID DESC";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL); //여러개 함수가 충돌되지않도록 함수 안에 작성해줌
			rs=pstmt.executeQuery(); //쿼리문 결과 여기에 저장
			if (rs.next()) {
				return rs.getInt(1) + 1; //rs의 결과에 따라 1을 더해서 다음 게시물의 번호 결정
			}
			return 1; //첫번째 게시물인 경우
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1; //데이터베이스 오류
	}
	
	//3. 실제로 글을 작성하는 함수
	public int write(String bbsTitle, String userID, String bbsContent) {
		String SQL = "INSERT INTO BBS VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL); //여러개 함수가 충돌되지않도록 함수 안에 작성해줌
			pstmt.setInt(1, getNext()); //다음번에 넣을 번호니깐 함수2번을 넣음
			pstmt.setString(2, bbsTitle);
			pstmt.setString(3, userID);
			pstmt.setString(4, getDate());
			pstmt.setString(5, bbsContent);
			pstmt.setInt(6, 1);
			return pstmt.executeUpdate(); //insert는 이것만 함
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1; //데이터베이스 오류
	}
}
