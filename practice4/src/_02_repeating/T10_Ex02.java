package _02_repeating;

import java.util.Scanner;

public class T10_Ex02 {

	public static void main(String[] args) {
		// 1.  주사위의 숫자 맞추기 게임
		Scanner sc = new Scanner(System.in);
		
		// 랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
		int dicenum = (int)(Math.random()*6)+1;
		
		while(true) {
			System.out.print("주사위의 숫자는? ");
			int answer = sc.nextInt(); //사용자로 부터 숫자 입력받기 (1~6까지만)
			if(answer == dicenum) {
				System.out.println("축하합니다, 맞혔습니다~!");
				break;
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		System.out.println("-------------------------------");
		
		//2. 5의 배수 합계
		int sum = 0;
		
		int i;
		
		for(i=1;i<=100;i++) {
			if(i%5==0) {
				sum+=i;
			}
		}
		System.out.println("5의 배수의 합계 : " + sum);
		
		System.out.println("-------------------------------");
		
		//3. 짝수 및 홀수 합
		int evenSum = 0;
		int oddSum = 0;
		
		for(i=1;i<=100;i++) {
			if(i%2==0) evenSum += i;
			if(i%2==1) oddSum += i;
		}
		
		System.out.println("짝수 합 : " + evenSum);
		System.out.println("홀수 합 : " + oddSum);
	}
}
