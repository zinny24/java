package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		//1. 영문자를 입력 받아 대문자로 변경하는 프로그램을 완성하시오.
		//  - q를 입력 받기 전까지는 계속해서 프로그램은 실행되어야 한다.
		//  - q를 입력 받으면 '시스템이 종료 되었습니다' 라는 메시지를 출력한다.
		
		boolean run = true;
		while(run) {
			System.out.print("입력 > ");
			String s = sc.next();
			
			if( s.equals("q") ) {
				//break : break에서 가장 가까운 반복문을 벗어남
				break;
			}
			
			System.out.println(s.toUpperCase());
		}
		System.out.println("시스템이 종료 되었습니다.");
	}

}










