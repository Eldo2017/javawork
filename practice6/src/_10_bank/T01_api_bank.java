package _10_bank;

public class T01_api_bank {
	private int balance;
	
	// 타 패캐지에서 사용하려면 접근 제한자는 무조건 public!
	// 입금 함수 (메소드)
	public void deposit(int money) {
		balance += money;
	}
	// 출금 함수 (메소드)
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔고가 부족하여 빼낼 수가 없습니다.");
		}
		else {
			balance -= money;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	
}
