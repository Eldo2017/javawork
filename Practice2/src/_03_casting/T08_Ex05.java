package _03_casting;

import java.util.Scanner;

public class T08_Ex05 {

	public static void main(String[] args) {
		// 2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int x = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int y = sc.nextInt();
		
		int sum = x + y;
		System.out.println("더하기 결과 : " + sum);
		int sub = x - y;
		System.out.println("빼기 결과 : " + sub);
		int mul = x * y;
		System.out.println("곱하기 결과 : " + mul);
		int div = x / y;
		System.out.println("나누기 결과 : " + div);
	}
}
