package users.v2useConstructor.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Users {
	private String userid;
	private String passwd;
	private String username;
	private int age;
	private LocalDateTime registerTime = LocalDateTime.now();

	public Users() {
	}
	
	public Users(String userid, String passwd, String username, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.age = age;
	}


	public String getUserid() {
		return userid;
	}



	public String getPasswd() {
		return passwd;
	}



	public String getUsername() {
		return username;
	}



	public int getAge() {
		return age;
	}



	public String getRegisterTime() {
		return DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss").format(registerTime);
	}

	public String disp() {
		return "아이디 : " + getUserid() + ""
				+ "\t비밀번호 : " + getPasswd()
				+ "\t이름 : " + getUsername()
				+ "\t나이 : " + getAge()
				+ "\t가입일 : " + getRegisterTime();
	}

}
