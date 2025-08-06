package _02_repeating;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		// do while문 : 조건을 나중에 확인하니 무조건 1번은 반드시 실행
		
		boolean q1 = false;
		
		while(q1) {
			System.out.println("while문");
		}
		System.out.println("-------------------");
		
		do {
			System.out.println("do-while문");
		} while(q1);
		
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		
		int answer = 0;
		do {
			System.out.println("(1번은 for문, 2번은 while문, 3번은 do while문, 0번은 종료)");
			System.out.print("숫자를 입력하시오 : ");
			answer = sc.nextInt();
			
			switch(answer) {
			case 1:
				System.out.println("for문 : 정해진 조건 기준까지 반복");
				break;
			case 2:
				System.out.println("while문 : 특정 조건 기준에 도달하면 종료");
				break;
			case 3:
				System.out.println("do while문 : 조건과 상관없이 무조건 1번은 실행");
				break;
			default:
				System.out.println("종료!");
				break;
			}
		} while(answer != 0);
		
		
	}
}
