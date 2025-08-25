package _01_Thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		setName("내가 고자라니"); // 스레드 이름 지정
		for(int i=1;i<=5;i++)
			System.out.println(getName());
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().setName("사딸라");
		
		for(int i=1;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
public class T01_thread {
	public static void main(String[] args) {
		Thread x1 = new Thread1();
		x1.start();
		
		
		Runnable a = new Thread2();
		Thread x2 = new Thread(a); // 생성자 Thread(Runnable Target)
		
		
		// Thread x2 = new Thread(new Thread2()); -> 이렇게도 가능
		x2.start();
	}
}
