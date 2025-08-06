package _02_repeating;

public class T08_random {

	public static void main(String[] args) {
		// random : Math 클래스에 있다 (수학 관련 클래스)
		double r1 = Math.random(); // 실수형: 0 ~ 0.9999999999999
		System.out.println(r1);
		
		System.out.println("-------------------------");
		
		// 0 ~ 9.999999999...
		double r2 = Math.random() * 10;
		System.out.println(r2);
		
		System.out.println("-------------------------");
		
		// 0 ~ 9
		int r3 = (int)(Math.random() * 10);
		System.out.println(r3);
		
		System.out.println("-------------------------");
		
		// 1 ~ 10
		int r4 = (int)(Math.random() * 10) + 1;
		System.out.println(r4);
				
		System.out.println("-------------------------");
		
		// 1 ~ 3
		int r5 = (int)(Math.random() * 3) + 1; // * 뒤에 숫자 입력해서 나오게 할 범위를 지정
		System.out.println(r5);
		
		System.out.println("-------------------------");
	}
}
