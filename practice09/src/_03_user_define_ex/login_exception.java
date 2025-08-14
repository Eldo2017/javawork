package _03_user_define_ex;

public class login_exception extends Exception {
	public login_exception() {};
	public login_exception(String msg) {
		super(msg);
	}
}
