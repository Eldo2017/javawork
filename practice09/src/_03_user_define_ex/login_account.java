package _03_user_define_ex;

import java.util.Scanner;

public class login_account {
	Scanner input = new Scanner(System.in);
	
	private String id = input.next();
	private String passwd = input.next();
	
	String getId(String id) {
		return id;
	}
	
	String getPasswd(String passwd) {
		return passwd;
	}
	
	void login(String id2, String passwd2) throws login_exception {
		if(!(id.equals(id2))) throw new login_exception("아이디가 잘못됐습니다.");
		else if(!(passwd.equals(passwd2))) throw new login_exception("비밀번호가 잘못됐습니다.");
		else System.out.println("로그인 성공");
	}
}
