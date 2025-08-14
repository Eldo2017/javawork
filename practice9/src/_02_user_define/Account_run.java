package _02_user_define;

public class Account_run {

	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(50000);
		
		try {
			a.withdraw(70000);
		} catch (UserException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
