package _01_Thread;

class ThreadA extends Thread {
	boolean stop = false;
	boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) System.out.println("A 작업 실행");
			else Thread.yield();
		}
		System.out.println();
		System.out.println("ThreadA 작업 종료");
	}
}

class ThreadB extends Thread {
	boolean stop = false;
	boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) System.out.println("B 작업 실행");
			else Thread.yield();
		}
		System.out.println();
		System.out.println("ThreadB 작업 종료");
	}
}

public class T09_yield {

	public static void main(String[] args) {
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		tA.start();
		tB.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tA.work = false; // 계속 B만 돌아간다
		System.out.println("A 작업을 일시정지합니다--------------------");		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tA.work = true; // 계속 A만 돌아간다
		System.out.println("A, B 번갈아 작업합니다--------------------");
		
		try { 
		Thread.sleep(500); 
		} catch (InterruptedException e) { 
		 e.printStackTrace(); 
		}
		 
		
		tA.stop = true;
		tB.stop = true;
		
		
	}

}
