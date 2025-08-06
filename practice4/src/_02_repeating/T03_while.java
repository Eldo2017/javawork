package _02_repeating;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		// for문 -> while문
		System.out.println("--------for문--------");
		int i;
		for(i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("--------while문--------");
		int j=1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		//예제: 1부터 100까지의 합
		int sum1=0;
		i=1;
		while(i<=100) {
			sum1+=i;
			i++;
		}
		System.out.println();
		System.out.println("합계 : " + sum1);
		
		int sum2=0;
		i=1;
		while(i<=100) {
			sum2 += i++; // sum2 = sum2 + i++;
		}
		System.out.println();
		System.out.println("합계 : " + sum2);
		
		System.out.println();
		
		// break : 반복문을 빠져나온다(for, while, do while 등)
		int count = 0;
		while(true) {
			System.out.println(++count);
			
			if(count == 200)
				break;
		}

		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		/*
		while(true) {
		 
			System.out.print("문자 하나를 입력하라 : ");
			
			char a = sc.next().charAt(0);
			System.out.println("입력한 문자 : " + a);
			
			if(a == 'x') {
				System.out.println("반복문 탈출");
				break;
			}
		}
		System.out.println("입력 종료");
		*/
		
		System.out.println();
		
		// 문제 : 사용자로부터 2개의 숫자를 입력받아서 더한 숫자 출력
		// 끝내려면은 0을 입력
		
		while(true) {
			System.out.print("두 개의 숫자 : ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int res = x + y;
			if(x == 0 && y == 0) {
				System.out.println("더 이상 입력할 숫자 없다");
				break;
			}
			System.out.println("결과 : " + res);
		}
		System.out.println("입력 종료");
	}

}
