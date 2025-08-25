package _01_Thread;

class SumThread extends Thread {
	private int sum;
	
	int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			sum += i;
		}
		System.out.println("종료");
	}
}
public class T10_join {
	public static void main(String[] args) {
		SumThread sT = new SumThread();
		
		sT.start();
		
		try {
			sT.join(); // 스레드가 끝날 때까지 기다린다
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~1000까지의 합 : " + sT.getSum());
	}
}
