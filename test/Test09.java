package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test09 {

	public static void main(String[] args) {
		String url 	= "jdbc:mysql://localhost:3306/springdb";
		String id 	= "spring12";
		String pwd	= "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url, id, pwd);
			
			String query = "SELECT * FROM member ORDER BY mem_id DESC";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			System.out.println("회원번호\t회원이름\t비밀번호");
			
			if( rs.next() ) {
				
				do {
					System.out.println(rs.getInt(1) + "\t"+rs.getString(2)+"\t" + rs.getString(3));
					
				}while( rs.next() );
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}








