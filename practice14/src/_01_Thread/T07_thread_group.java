package _01_Thread;

public class T07_thread_group {

	public static void main(String[] args) {
		ThreadGroup m = Thread.currentThread().getThreadGroup();
		String groupName = m.getName();
		System.out.println(groupName);
		
		ThreadGroup g1 = new ThreadGroup("CB01");
		ThreadGroup g2 = new ThreadGroup("GT02");
		ThreadGroup subg1 = new ThreadGroup(g1,"subGroup1");
		
		g1.setMaxPriority(9);
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		/*
		  Thread()
		  Thread(Runnable r)
		  Thread(ThreadGroup tg, Runnable r, String name) 
		 */
		
		Thread t1 = new Thread(g1,r,"CB-01");
		Thread t2 = new Thread(subg1,r,"GT-02");
		Thread t3 = new Thread(g2,r,"RH-03");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("실행 중인 스레드 상위 그룹명 : " + m.getName());
		System.out.println("실행 중인 스레드 그룹 수 : " + m.activeGroupCount());
		System.out.println("실행 중인 스레드 수 : " + m.activeCount());
		m.list();
	}

}
