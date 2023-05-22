package emp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;
import emp.domain.Employee;

public class EmployeeDao {
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//입력
	public void insertEmp(Employee emp) {
		String query = "INSERT INTO emp VALUES(?, ?, ?);";
		try {
			pstmt = DBConnect.createConnection().prepareStatement(query);
			pstmt.setInt(1, emp.getEmpID());
			pstmt.setString(2, emp.getEmpPWD());
			pstmt.setString(3, emp.getEmpBuseoCode());
			int result = pstmt.executeUpdate();
			
			if( result > 0 )
				System.out.println("사원이 등록되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//출력
	public void selectEmp() {
		String query = "SELECT * FROM emp ORDER BY emp_id ASC";
		try {
			pstmt = DBConnect.createConnection().prepareStatement(query);
			rs = pstmt.executeQuery();
			
			System.out.println("사원목록을 출력합니다.");
			System.out.println("-------------------------");
			if( rs.next() ) {
				do {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) );
					
				}while(rs.next());
				
			}else {
				System.out.println("사원을 등록해 주세요.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	//삭제
	public void deleteEmp(int del) {
		String query = "DELETE FROM emp WHERE emp_id = ?";
		try {
			pstmt = DBConnect.createConnection().prepareStatement(query);
			pstmt.setInt(1, del);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//수정
	public void updateEmp() {
		
	}
}








