package emp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;

public class Emp_Ex {
	
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
//		DBConnect.createConnection();
			
		String empID 			= "100";
		String empPWD 			= "1234";
		String empBuseoCode 	= "K100";
		
		String query = "INSERT INTO emp VALUES(?, ?, ?);";
		
		try {
			pstmt = DBConnect.createConnection().prepareStatement(query);
			pstmt.setString(1, empID);
			pstmt.setString(2, empPWD);
			pstmt.setString(3, empBuseoCode);
			int result = pstmt.executeUpdate();
			
			if( result == 0 ) {
				System.out.println("사원정보를 입력할 수 없습니다. 관리자에게 문의하세요");
			}else {
				System.out.println("사원정보가 등록 되었습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}









