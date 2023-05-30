package test;

public class Test04 {

	public static void main(String[] args) {
		
		/* --------------------------------------*/
//		for(초기값; 조건문; 증감값) {
//			출력코드
//		}
		
		/* --------------------------------------*/
		
//		초기값
//		while(조건문) {
//			출력코드;
//			증감값;
//		}
		/* --------------------------------------*/
		
//		초기값
//		do {
//			출력코드;
//			증감값;
//			
//		}while(조건문);
		/* --------------------------------------*/
		
		//a-z까지 출력하는 프로그램
		//97, 122
		for(int i = 97; i <= 122; ++i) {
			System.out.print( (char) i );
		}
		
		System.out.println("");
		System.out.println("");
		
		int i = 97;
		do {
			System.out.print( (char)i );
			++i;
			
		}while(i <= 122);
		
	}

}









