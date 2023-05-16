package employee2.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			String url 		= "jdbc:mysql://localhost:3306/emp";
			String userID 	= "root";
			String userPWD 	= "1234";
			
			conn = DriverManager.getConnection(url, userID, userPWD);
			//System.out.println("연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}














