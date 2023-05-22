package emp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;
import emp.domain.Employee;

public class InsertEmp_Ex {
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		//DBConnect.createConnection();
		
		int empID 				= 500;
		String empPWD 			= "0000";
		String empBuseoCode 	= "K200";
		
		//setter에 변수값을 저장 : 객체생성 -> setter안에 저장
		//객체명.set필드명(변수명);
		
		Employee emp = new Employee();
		emp.setEmpID(empID);
		emp.setEmpPWD(empPWD);
		emp.setEmpBuseoCode(empBuseoCode);
		
		
		//사용할 때 : 객체 생성 -> getter
		//객체명.get필드명();
		
		String query = "INSERT INTO emp VALUES(?, ?, ?);";
		try {
			pstmt = DBConnect.createConnection().prepareStatement(query);
			pstmt.setInt(1, emp.getEmpID());
			pstmt.setString(2, emp.getEmpPWD());
			pstmt.setString(3, emp.getEmpBuseoCode());
			int result = pstmt.executeUpdate();
			
			if( result > 0 ) {
				System.out.println("저장");
				
			
			}else {
				System.out.println("실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}









