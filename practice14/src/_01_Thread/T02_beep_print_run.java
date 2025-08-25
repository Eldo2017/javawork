package _01_Thread;

import java.awt.Toolkit;

public class T02_beep_print_run {

	public static void main(String[] args) {
		Toolkit x = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<5;i++) {
			x.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("찌잉!");
		}
	}

}
