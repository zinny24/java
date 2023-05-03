/*
 * 1. 프로그램명 : 학생성적관리시스템(LMS)
 * 2. 작성일 : 2023.05.02
 * 3. 작성자 : 홍길동
 * 4. 내 용 : ~ Ch02를 활용한 자바 프로그램 작성 
*/

package ch02;

public class Ch02_Ex01 {

	public static void main(String[] args) {
		//1. 두 변수(국어, 영어)에 정수를 입력 받아 두 과목의 총점, 평균을 출력하는 프로그램을 작성하시오
		// (1) 두 변수가 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
		// (2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
		// 프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.
		
		int stdKor = 80;
		int stdEng = 77;
		int sum = 0;
		double avg = 0.0;
		
		if( ( stdKor > 0 ) && (stdEng > 0) ) {
			sum = stdKor + stdEng;
			avg = (stdKor + stdEng) / 2;
			System.out.println("총점 : " + sum + "점");
			System.out.println("평균 : " + avg + "점");
		
		}else {
			System.out.println("계산할 수 없습니다.");
		}

	}

}
