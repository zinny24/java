package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test08 {

	public static void main(String[] args) {
		//DB 입출력
		//1. 연결 : Connection 객체(연결 정보가 필요) -> DriverManager
		//2. 쿼리실행 : PreparedStatement 객체
		//3. (출력) : ResultSet 객체
		
		String url 	= "jdbc:mysql://localhost:3306/springdb";
		String id 	= "spring12";
		String pwd	= "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, id, pwd);
			
			//쿼리실행
			/*
			1. primary key가 있으면
			INSERT INTO 테이블명(컬럼1, 컬럼2..) VALUES(값1, 값2...)
			
			2. primary key x
			INSERT INTO 테이블명 VALUES(값1, 값2...)
			*/
			
			String query = "INSERT INTO member(mem_name, mem_passwd) VALUES(?, ?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "koreait");
			pstmt.setString(2, "1234");
			int result = pstmt.executeUpdate();
			if( result > 0 ) {
				System.out.println("회원 가입이 완료 되었습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}











