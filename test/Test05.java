package test;

import java.util.Scanner;

class Cals {
	//총점
	public int sum(int stdKor, int stdEng, int stdMath) {
		return stdKor + stdEng + stdMath;
	}
	
	//평균
	public double avg(int stdKor, int stdEng, int stdMath) {
		return (stdKor + stdEng + stdMath) / (double) 3;
	}
}


public class Test05 {

	public static void main(String[] args) {
		//국어, 영어, 수학 점수를 scanner로 입력 받아 총점, 평균을 구하시오.
		//국어, 영어, 수학 점수는 0보다 클 때만 총점, 평균을 구하며, 0보다 작은 값을 입력하면 '계산할 수 없습니다.' 출력
		//객체를 별도로 생성하며 메소드로 총점, 평균 구하는 프로그램을 작성한다.
		//총점은 **점, 평균은 **.**점으로 출력형식을 맞춘다.
		//생성 객체의 이름은 임의로 작성한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 > ");
		int stdKor 	= sc.nextInt();
		
		System.out.print("영어점수 > ");
		int stdEng	= sc.nextInt();
		
		System.out.print("수학점수 > ");
		int stdMath	= sc.nextInt();
		
		if( (stdKor > 0) && (stdEng > 0) && (stdMath > 0) ) {
			Cals cs = new Cals();
			
			System.out.println("총점 : " + cs.sum(stdKor, stdEng, stdMath) + "점");
			//System.out.println("평균 : " + cs.avg(stdKor, stdEng, stdMath) + "점");
			System.out.printf("평균 : %.2f점", cs.avg(stdKor, stdEng, stdMath));
			
		} else {
			System.out.println("계산할 수 없습니다.");
		}
	}
}












