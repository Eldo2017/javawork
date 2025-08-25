package _01_Thread;

public class T04_thread_single {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		for(int i=0;i<500; i++) {
			System.out.printf("%s",new String("#"));
		}
		System.out.println();
		System.out.println("# 소요 시간 = " + (System.currentTimeMillis() - start));
		
		for(int i=0;i<500; i++) {
			System.out.printf("%s ",new String("Gavv"));
		}
		System.out.println();
		System.out.println("Gavv 소요 시간 = " + (System.currentTimeMillis() - start));
	}

}
