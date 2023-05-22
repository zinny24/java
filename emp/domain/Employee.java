package emp.domain;

public class Employee {
	private Integer empID;
	private String empPWD;
	private String empBuseoCode;
	
	public Employee() {}

	public Integer getEmpID() {
		return empID;
	}

	public String getEmpPWD() {
		return empPWD;
	}

	public String getEmpBuseoCode() {
		return empBuseoCode;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public void setEmpPWD(String empPWD) {		
		this.empPWD = empPWD;
	}

	public void setEmpBuseoCode(String empBuseoCode) {
		this.empBuseoCode = empBuseoCode;
	}

	public void disp() {
		System.out.println("============사원 정보 출력============");
		System.out.println("EMP_ID\t\tEMP_PWD\t\tEMP_BUSEO_CODE");
		System.out.println("-----------------------------------");
		System.out.println(empID);
	}
	
}






