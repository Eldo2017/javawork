package _01_opearation;

import java.util.Scanner;

public class T07_Ex02 {

	public static void main(String[] args) {
		// 1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		String answer1 = x > 0 ? "양수다" : "양수 아니다";
		
		System.out.println(answer1);
		
		// 2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
		int y = sc.nextInt();
		
		String answer2 = y > 0 ? "양수다" : y == 0 ? "0" : "음수다";
		
		System.out.println(answer2);
		
		// 3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
		int z = sc.nextInt();
		
		String answer3 = (z % 2) == 0 ? "짝수다" : "홀수다";
		
		System.out.println(answer3);

	}

}
