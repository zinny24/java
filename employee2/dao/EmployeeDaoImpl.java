package employee2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import employee2.db.DBConnect;
import employee2.model.Employee;

public class EmployeeDaoImpl implements EmployeeDaoInter {
	Connection conn = null;

	@Override
	public void addEmployee(Employee employee) {
		
	}

	@Override
	public void viewAllEmployee() {
		
	}

	@Override
	public void viewOneEmployee(int id) {
		String sql = "SELECT * FROM employees WHERE id = ?";
	}

	@Override
	public void updateEmployee(Employee employee) {
		
	}

	@Override
	public void deleteEmployee(int id) {
		String sql = "DELETE FROM employees WHERE id = ?";
	}

}
















