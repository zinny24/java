/*
 * 1. 프로그램명 : 학생성적관리시스템(LMS)
 * 2. 작성일 : 2023.05.02
 * 3. 작성자 : 홍길동
 * 4. 내 용 : Scanner와 배열을 이용하여 성적 출력하기
*/

package ch02;

import java.util.Scanner;

class Cal04 {
	
	public int sum(int[] scores) {
		int sum = 0;
		for(int i : scores)
			sum += i;
		
		return sum;
	}
	
	public double avg(int[] scores) {
		double avg = 0.0;
		int sum = 0;
		
		for(int i : scores)
			sum += i;
		
		return sum / (double)scores.length;
	}
}

public class Ch02_Ex06 {

	public static void main(String[] args) {
		//1. 국어, 영어, 수학 점수를 Scanner 객체로 입력 받아 배열에 저장 후 총점, 평균을 출력하는 프로그램을 작성하시오
		// (1) 국어, 영어, 수학 점수가 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
		// (2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
		// (3) 메소드를 이용하여 총점 및 평균을 구하는 프로그램을 작성한다.
		// (4) 객체를 별도로 작성하여 작성한 객체에 메소드를 작성하여 출력한다.
		// 프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 > ");
		int stdKor = sc.nextInt();
		
		System.out.print("영어점수 > ");
		int stdEng = sc.nextInt();
		
		System.out.print("수학점수 > ");
		int stdMath = sc.nextInt();
		
		int[] scores = new int[] {stdKor, stdEng, stdMath};
		if( ( scores[0] > 0 ) && (scores[1] > 0) && (scores[2] > 0) ) {
			Cal04 c04 = new Cal04();
			System.out.println("총점 : " + c04.sum(scores) + "점");
			System.out.println("평균 : " + c04.avg(scores) + "점");
		
		}else {
			System.out.println("계산할 수 없습니다.");
		}

	}

}






