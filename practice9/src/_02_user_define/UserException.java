package _02_user_define;

public class UserException extends Exception{
	public UserException() {};
	public UserException(String msg) {
		super(msg);
	}
}
