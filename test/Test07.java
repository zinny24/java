package test;

public class Test07 {

	public static void main(String[] args) {
		//주민번호가 1,3이면 남자 2,4면 여자로 출력하시오.
		String jumin = "001234-4234567";
		
		//배열번호 7번째 것부터 8번째 것까지
		int gender = Integer.parseInt( jumin.substring(7, 8) );
		
		if( gender % 2 == 0 ) {
			System.out.println("여자");
			
		}else {
			System.out.println("남자");
		}
	}

}






