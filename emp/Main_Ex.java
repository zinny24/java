package emp;

import java.util.Scanner;

import emp.dao.EmployeeDao;
import emp.domain.Employee;

public class Main_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDao();
		
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		
		//입력
		if( choice == 1 ) {
			
			int empID 			= 700;
			String empPWD 		= "0000";
			String empBuseoCode = "K300";

			Employee emp = new Employee();
			emp.setEmpID(empID);
			emp.setEmpPWD(empPWD);
			emp.setEmpBuseoCode(empBuseoCode);
			
			dao.insertEmp(emp);
			dao.selectEmp();
			
		}else if( choice == 2 ) { //출력
			dao.selectEmp();
			
		}else if( choice == 3 ) { //삭제
			int del = 700;
			
			dao.deleteEmp(del);
			dao.selectEmp();
		}

		
		
		//출력
		
	}

}
















