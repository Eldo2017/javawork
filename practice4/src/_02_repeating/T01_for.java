package _02_repeating;

public class T01_for {

	public static void main(String[] args) {
		// 반복문 : 원하는 수만큼 반복 실행
		/*
		  for(초기식;조건식;증감식) { 
		  	 실행문; 
		  }
		 */

		for(int i=1;i<=100;i++) {
			System.out.print(i + ". 나 종로의 ");
			System.out.println("김두한이다");
		}
		
		System.out.println("========================");
		
		int i;
		
		for(i=1;i<=10;i+=3) {
			System.out.print(i + ". 나 종로의 ");
			System.out.println("김두한이다");
		}
		
		System.out.println("========================");
		
		for(i=10;i>=1;i--) {
			System.out.print(i + ". 나 종로의 ");
			System.out.println("김두한이다");
		}
		
		System.out.println("========================");
		
		// 예제: 1부터 100까지의 합
		int sum = 0;
		
		for(i=1;i<=100;i++) {
			sum += i;//sum = sum + i;
		}
		
		System.out.println("합계: " + sum);
	}
}
