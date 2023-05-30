package test;

public class Test01 {

	public static void main(String[] args) {
		//1에서 10까지 3의 배수 이거나 5의 배수의 합을 구하시오.(출력)
		//1에서 10까지 3의 배수 또는 5의 배수의 합을 구하시오.
		
		//반복문, 조건문, 산술연산 %(나머지)
		//AND : 이고, 이면서 - &&
		//OR : 이거나, 또는 - ||
		//sum += i;
		
		int sum = 0;
		for(int i = 1; i < 10; ++i) {
			
			if( i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}








