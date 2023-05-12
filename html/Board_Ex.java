package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Board_Ex {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Subject subject = new Subject();
		conn = subject.getConnection();
		
		Scanner sc = new Scanner(System.in);		
		boolean isFlag = true;
		while( isFlag ) {
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println(" 1.게시물 등록   2.게시물 목록   3.게시물 삭제   4.게시물 수정   5.종료 ");
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			
			System.out.print("선택 > ");
			int menu = Integer.parseInt(sc.nextLine()); //띄어쓰기 글자 입력 가능하게
			System.out.println("");
			
			switch(menu) {
			case 1:
				System.out.println("");
				System.out.println("#######################################################");
				System.out.println("                 게시물 등록을 등록합니다                   ");
				System.out.println("#######################################################");
				System.out.println("");
				
				System.out.print("제목 > ");
				String sub = sc.nextLine();
				
				System.out.print("작성자 > ");
				String wri = sc.nextLine();
				
				System.out.print("내용 > ");
				String con = sc.nextLine();
				
				/* ---------------------------------------- */
				/* Scanner 정보를 객체로 받아서 저장하기(setter)  */
				/* ---------------------------------------- */
				
				subject.setTitle(sub);
				subject.setName(wri);
				subject.setContent(con);
				
String query = "INSERT INTO board(title, name, content, regdate) VALUES(?, ?, ?, now())";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString( 1, subject.getTitle() );
					pstmt.setString( 2, subject.getName() );
					pstmt.setString( 3, subject.getContent() );
					int result = pstmt.executeUpdate();
					
					if( result > 0 ) {
						System.out.println("게시물이 등록되었습니다.");
					}else {
						System.out.println("게시물을 등록할 수 없습니다.\n관리자에게 문의하세요.");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("데이터베이스를 사용할 수 없습니다.");
				}
				
				System.out.println("");
				break;
				
			case 2:
				System.out.println("");
				System.out.println("#######################################################");
				System.out.println("                 게시물 목록을 보여 줍니다                   ");
				System.out.println("#######################################################");
				System.out.println("");
				break;
				
			case 3:
				System.out.println("");
				System.out.println("#######################################################");
				System.out.println("                    게시물을 삭제합니다                     ");
				System.out.println("#######################################################");
				System.out.println("");
				break;
				
			case 4:
				System.out.println("");
				System.out.println("#######################################################");
				System.out.println("                    게시물을 수정합니다                     ");
				System.out.println("#######################################################");
				System.out.println("");
				break;
				
			default:
				System.out.println("");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("                    프로그램을 종료합니다                     ");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.exit(0);
			}
			
		}
		sc.close();
	}
}











