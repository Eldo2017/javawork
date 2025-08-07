package _03_casting;

import java.util.Scanner;

public class T10_Ex07 {

	public static void main(String[] args) {
		// 4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하라 : ");
		String str = sc.next();
		
		
		char c1 = str.charAt(0);
		char c2 = str.charAt(1);
		char c3 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + c1);
		System.out.println("두 번째 문자 : " + c2);
		System.out.println("세 번째 문자 : " + c3);
	}

}
