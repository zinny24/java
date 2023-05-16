package employee2;

import java.util.Scanner;

import employee2.dao.EmployeeDaoImpl;
import employee2.model.Employee;

public class Employee_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== Welcome to Koreait Employees System Application ===");
		
		EmployeeDaoImpl edi = new EmployeeDaoImpl(); //입력, 수정, 삭제, 출력 -> 전역객체
		
		boolean isRun = true;
		while(isRun) {
			System.out.println("1.AddEmployee\n"
					+ "2.ViewAllEmployee\n"
					+ "3.ViewOneEmployee\n"
					+ "4.UpdateEmployee\n"
					+ "5.DeleteEmployee\n"
					+ "6.Exit");
			
			System.out.println("");
			System.out.print("Enter Choice > ");
			int ch = Integer.parseInt(sc.nextLine());
			
			switch(ch) {
			case 1:
				System.out.println("");
				System.out.println("1.AddEmployee");
				System.out.println("");		
				
				break;
				
			case 2:
				System.out.println("");
				System.out.println("2.ViewAllEmployee");
				System.out.println("");
				
				
				break;
				
			case 3:
				System.out.println("");
				System.out.println("3.ViewOneEmployee");
				System.out.println("");
				break;
				
			case 4:
				System.out.println("");
				System.out.println("4.UpdateEmployee");
				System.out.println("");
				break;
				
			case 5:
				System.out.println("");
				System.out.println("5.DeleteEmployee");
				System.out.println("");
				break;
				
			default:
				System.out.println("");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
		
	}

}








