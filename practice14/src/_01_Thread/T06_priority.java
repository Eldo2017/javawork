package _01_Thread;

class Thread4 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print("%");
			for(int j=0;j<10;j++);
		}
		System.out.println();
		System.out.println("w-End");
	}
}

class Thread5 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print("%");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("c-End");
	}
}

public class T06_priority {

	public static void main(String[] args) {
		Thread4 w = new Thread4();
		Thread5 c = new Thread5();
		
		w.setPriority(Thread.MIN_PRIORITY);
		c.setPriority(Thread.MAX_PRIORITY);
		System.out.println("w의 우선순위 : " + w.getPriority());
		System.out.println("c의 우선순위 : " + c.getPriority());
		
		w.start();
		c.start();
	}

}
