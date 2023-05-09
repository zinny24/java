package avg;

public class Average {

	public static void main(String[] args) {
		//45.3, 67.5, -45.6, 20.34, 33.0, 45.6 값을 배열에 저장한 후 평균을 구하시오
		//for, printf()를 이용하여 평균은 소수점 2자리까지 출력하시오.
		
		double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
		double sum = 0.0;

		for (double num : numArray) {
			sum += num;
		}

		double average = sum / numArray.length;
		System.out.format("The average is: %.2f", average);

	}

}
