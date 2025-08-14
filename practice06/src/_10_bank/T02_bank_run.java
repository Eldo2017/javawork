package _10_bank;

public class T02_bank_run {

	public static void main(String[] args) {
		T01_api_bank bank = new T01_api_bank();
		
		bank.deposit(34000);
		
		System.out.println("현재 잔고 : " + bank.getBalance() + "원");
		
		bank.withdraw(20000);
		
		System.out.println("현재 잔고 : " + bank.getBalance() + "원");
		
		bank.withdraw(15000);
		
		System.out.println("현재 잔고 : " + bank.getBalance() + "원");
	}

}
