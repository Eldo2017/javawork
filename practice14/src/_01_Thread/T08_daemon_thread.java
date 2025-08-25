package _01_Thread;

class AutoSaveThread extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("작업 파일이 자동 저장됐습니다.");
		}
	}
}
public class T08_daemon_thread {

	public static void main(String[] args) {
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true); // 데몬 스레드로 변경. setDaemon(true)로 변경하면 데몬이다
							// 만약 넣지 않는다면 일반 스레드다
		at.start();
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("The End");
	}

}
