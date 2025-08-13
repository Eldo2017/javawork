package _01_exception;

import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나누기 할 정수 2개를 입력하라 : ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		try {
			System.out.println("몫 : " + x/y);
			System.out.println("나머지 : " + x%y);
		}
		catch(ArithmeticException e) {
			System.out.println("나눌 수 없는 수로 나누셨습니다.");
			System.out.println(e);
		}
	}

}
