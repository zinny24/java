package test;

class Calculator {

	public boolean isOddEven(int num) {
		return num % 2 == 0;
	}
}

public class Test03 {
	
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		Calculator cal = new Calculator();
		System.out.println(cal.isOddEven(num1));
		System.out.println(cal.isOddEven(num2));
	}

}








