package emp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//1. 데이터베이스는 insert, select, delete, update 등등 여러 곳에서 사용하기 때문에
//   static(공유 : 하나를 메모리에 생성해서 공유해서 사용)
//2. 생성자(new 생성자() x) -> 클래스이름.메소드이름()로 사용

public class DBConnect {
	
	static Connection conn = null;
	
	public static Connection createConnection() {
		
		String url 	= "jdbc:mysql://localhost:3306/employees";
		String user = "employees";
		String pwd  = "1234";
		
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return conn;
	}
}







