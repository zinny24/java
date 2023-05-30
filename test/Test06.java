package test;

public class Test06 {

	public static void main(String[] args) {
		//구구단
//		단 : 2-9 : 순차적 반복 - for
//		수 : 1-9 : 순차적 - for
//		=> 바깥쪽 for 1번 실행될 때 안쪽에 있는 for가 처음부터 끝까지 실행
		
		for(int i = 2; i < 10; ++i) { //단
			
			for(int j = 1; j < 10; ++j) { //1-9
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("");
		}
	}

}






