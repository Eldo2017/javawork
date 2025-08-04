package _02_Scanner;

public class T03_printf {

	public static void main(String[] args) {
		// 십진수 출력
		System.out.printf("%d\n", 62);
		System.out.printf("%d, %d\n", 32, 39);
		
		int x = 40;
		int y = 15;
		System.out.printf("%d, %d\n", x, y);
		
		// 8진수 출력
		System.out.printf("%o\n", 17);
		
		// 16진수 출력
		System.out.printf("%x\n", 14);
		System.out.printf("%X\n", 14);
		
		// 실수형 출력
		System.out.printf("%f\n", 26.93358254);
		
		// 문자 1개 출력
		System.out.printf("%c\n", 'x');
		
		// 문자열 출력
		System.out.printf("%s\n", "가면라이더 진게이저");
		
		// 참 or 거짓 출력
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);
		System.out.printf("%b\n", 17 < 10);
		System.out.printf("%b\n", 69 < 92);
		
		// 현재 2025년 8월이고, 우리나라 평균 온도는 34.5도이다.
		System.out.printf("현재 %d년 %d월이고, 우리나라 평균 온도는 %.1f도이다.\n", 2025, 8 , 34.5);
		// 이 과정의 정원은 25명이고, 현재 19명이 수강 중이며 95% 달성했다.
		System.out.printf("이 과정의 정원은 %d명이고, 현재 %d명이 수강 중이며 %d%% 달성했다.\n", 25, 19, 95); // % 뒤에 %를 출력할거면 뒤에 %를 더 붙이면 된다
		// format 문 = printf 문
		System.out.format("현재 %d년 %d월이고, 우리나라 평균 온도는 %.1f도이다.\n", 2025, 8 , 34.5); //.f : 소수점 6자리까지만 출력, %.1f : 소수점 한 자리까지만 출력
		System.out.format("이 과정의 정원은 %d명이고, 현재 %d명이 수강 중이며 %d%% 달성했다.", 25, 19, 95);
		
		
	}
}
