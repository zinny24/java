package users.v2useConstructor;

import java.util.Scanner;

import users.v2useConstructor.model.Users;


public class v2useConstructor {

	public static void main(String[] args) {
		Users[] user = new Users[3];
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("======================================================");
			System.out.println(" 1. 회원가입  |  2. 회원목록  |  3. 회원검색 | 4. 프로그램 종료");
			System.out.println("======================================================");
			
			System.out.print("메뉴 선택 > ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				System.out.println("");
				System.out.println("##### 회원가입을 진행합니다 #####");
				System.out.println("");
				
				for(int i = 0; i < user.length; ++i) {
					
					System.out.println( (i+1) + "번째 회원을 입력합니다 ...");
					System.out.print("아이디 > ");
					String uid = sc.next();
					
					System.out.print("비밀번호 > ");
					String pwd = sc.next();
					
					System.out.print("이름 > ");
					String uname = sc.next();
					
					System.out.print("나이 > ");
					int old = sc.nextInt();
					
					//getter, setter -> constructor
					user[i] = new Users(uid, pwd, uname, old);
					
					System.out.println("");
				}
				
				System.out.println("");
				break;
				
			case 2:
				System.out.println("");
				System.out.println("2. 회원목록을 보여줍니다 ...");
				System.out.println("------------------------------------------------------");
				
				if( user[0] == null ) {
					System.out.println("가입된 회원이 없습니다.");	
					
				}else {
					for(int i = 0; i < user.length; ++i) {
						System.out.println( (i+1) + "번\t" + user[i].disp() );
					}
				}
				
				System.out.println("------------------------------------------------------");
				System.out.println("");
				break;
				
			case 3:
				System.out.println("");
				System.out.println("3. 회원을 검색합니다 ...");
				System.out.println("");
				System.out.println("");
				System.out.print("검색회원번호 > ");
				int idx = sc.nextInt();
				System.out.println("");
				
				
				if( user[0] == null || (idx-1) >= user.length ) {
					System.out.println("검색 결과가 없습니다.");
						
				}else {
					for(int i = 0; i < user.length; ++i) {
						if( (idx-1) == i ) {
							System.out.println("검색 결과입니다...");
							System.out.println("------------------------------------------------------");
							System.out.println( idx + "번\t" + user[idx-1].disp());
							System.out.println("------------------------------------------------------");
						}
					}
				}
				System.out.println("");
				
				
				break;
			default:
				System.out.println("");
				System.out.println("4. 프로그램을 종료합니다 ...");
				System.out.println("");
				System.exit(0);
			}
		}
		
		sc.close();
	}

}
