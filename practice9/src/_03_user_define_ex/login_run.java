package _03_user_define_ex;

public class login_run {

	public static void main(String[] args){
		login_account l = new login_account();
		
		try {
			l.login("Eldo9524", "Caries6201");
		} catch (login_exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
