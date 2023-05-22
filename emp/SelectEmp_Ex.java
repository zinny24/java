package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.db.DBConnect;
import emp.domain.Employee;

public class SelectEmp_Ex {
	
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		//DBConnect.createConnection();
		String query = "SELECT * FROM emp ORDER BY emp_buseo_code ASC, emp_id DESC";
		
		try {
			pstmt = DBConnect.createConnection().prepareStatement(query);
			rs = pstmt.executeQuery();
			
			
			if( rs.next() ) {
				do {

					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) );
					
				}while(rs.next());
			
			}else {
				System.out.println("등록된 사원이 없습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}



















