package conti;

public class SumNatural {

	public static void main(String[] args) {
		//1~100 짝수의 합을 구하시오
		
		int num = 100, sum = 0;

		for (int i = 1; i <= num; ++i) {
			if( i % 2 != 0)
				continue;
			
			sum += i;
		}

		System.out.println("Sum = " + sum);
	}

}
