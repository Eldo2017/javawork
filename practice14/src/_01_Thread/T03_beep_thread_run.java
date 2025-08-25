package _01_Thread;

import java.awt.Toolkit;

class beepTest extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("찌잉!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class T03_beep_thread_run {

	public static void main(String[] args) {
		Toolkit x = Toolkit.getDefaultToolkit();
		beepTest y = new beepTest();
		y.start();
		
		for(int i=0;i<5;i++) {
			x.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
