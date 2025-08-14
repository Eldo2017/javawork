package _01_condition;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 if(조건식){
		 	참일 때 실행할 구문
		 } else {
		 	거짓일 때 실행할 구문
		 }
		 */
		
		int score = 66;
		
		if(score >= 75) {
			System.out.println("축하!");
			System.out.println("합격!");
		}
		else {
			System.out.println("아쉽!");
			System.out.println("불합격!");
		}
		
		System.out.println();
		
		int x = 35;
		if(x >= 0) System.out.println("양수");
		else System.out.println("음수");
		
		// 사용자로부터 숫자 하나를 입력받아서 그게 짝수인지 홀수인지 구분하라
		System.out.print("숫자 하나를 입력하라 : ");
		int y = sc.nextInt();
		
		if(y % 2 == 1) System.out.println("홀수");
		else System.out.println("짝수");
	}

}
