package users.v1useGetterSetter.model;

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

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
