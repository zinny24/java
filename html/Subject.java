package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Subject {
	//필드
	private int bid;
	private String title;
	private String name;
	private String content;
	private String regdate;
	
	public int getBid() {
		return bid;
	}
	public String getTitle() {
		return title;
	}
	public String getName() {
		return name;
	}
	public String getContent() {
		return content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	//Connection 연결 객체를 메소드화
	
	public Connection getConnection() {
		Connection conn = null;
		
		
		String url 	= "jdbc:mysql://localhost:3306/groupware";
		String uid 	= "root";
		String upwd = "1234";
		
		try {
			conn = DriverManager.getConnection(url, uid, upwd);
			System.out.println("연결 완료");

		}catch(SQLException sqle) {
			sqle.printStackTrace();
			System.out.println("연결 실패");
		}
		
		return conn;
	}
}












