package _01_Thread;

class Bank {
	private int balance = 100000;

	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -= money;
		}
	}
}

class ThreadSy implements Runnable {

	Bank b = new Bank();
	
	@Override
	public void run() {
		while(b.getBalance() > 0) {
			int money = (int)(Math.random()*3+1)*1000;
			b.withdraw(money);
			System.out.println("잔액 : " + b.getBalance());
		}
	}
	
}
public class T11_synchronized {

	public static void main(String[] args) {
		Runnable r = new ThreadSy();
		new Thread(r).start();
		
	}

}
