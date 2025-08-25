package _01_Thread;

class Thread3 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<500; i++) {
			System.out.printf("%s ",new String("Gavv"));
		}
		System.out.println();
		System.out.println("Gavv 소요 시간 = " + (System.currentTimeMillis() - T05_thread_multi.start));
	}
	
}

public class T05_thread_multi {
	static long start;
	public static void main(String[] args) {
		Thread x = new Thread(new Thread3());
		x.start();
		
		start = System.currentTimeMillis();
		
		for(int i=0;i<500; i++) {
			System.out.printf("%s",new String("#"));
		}
		System.out.println();
		System.out.println("# 소요 시간 = " + (System.currentTimeMillis() - start));
		
		
	}

}
