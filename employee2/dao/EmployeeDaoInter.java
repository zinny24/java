package employee2.dao;

import employee2.model.Employee;

public interface EmployeeDaoInter {
	
	public void addEmployee(Employee employee);
	
	public void viewAllEmployee();
	
	public void viewOneEmployee(int id);
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
}













