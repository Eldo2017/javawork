package _02_user_define;

public class Account {
	private int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	int getBalance() {
		return balance;
	}
	
	void withdraw(int money) throws UserException{
		if(balance < money)
			throw new UserException("잔고가 모자랍니다 : " + (money - balance) + " 정도");
		else 
			balance -= money;
	}
}
