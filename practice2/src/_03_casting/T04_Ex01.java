package _03_casting;

import java.util.Scanner;

public class T04_Ex01 {

	public static void main(String[] args) {
		// 문자 하나를 입력받아서 그 문자의 유니코드를 출력하라
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력하라 : ");
		String ch1 = sc.next();
		System.out.println("하나의 문자 : " + ch1);
		
		//문자열 첫글자를 문자로 추출
		char ch2 = ch1.charAt(0);
		
		int ch3 = ch2;
		System.out.println("입력한 문자의 유니코드 : " + ch3);
		
		/*
		 or
		 
		 char ch4 = scan.next().charAt(0); -> 이렇게도 가능
		 */
	}
}
