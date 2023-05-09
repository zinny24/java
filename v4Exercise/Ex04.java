package oddeven;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//Scanner로 정수를 입력 받아 홀수, 짝수를 출력하시오.
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = reader.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
	}

}
