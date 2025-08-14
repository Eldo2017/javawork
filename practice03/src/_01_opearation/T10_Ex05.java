package _01_opearation;

import java.util.Scanner;

public class T10_Ex05 {

	public static void main(String[] args) {
		// 9.  사용자로부터 두 개를 입력 받아 num1, num2에 저장하고
	    // 또 다른 정수를 입력 받아 그 수가 num1 미만거나 num2 초과이면 true를 출력하고
	    // 아니면 false를 출력. (단, num1은 num2보다 작아야 함)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하라 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("또 하나의 정수를 입력하라 : ");
		int num3 = sc.nextInt();
		
		boolean answer1 = (num3 < num1) || (num3 > num2) ? true : false;
		
		System.out.println(answer1);
		
		// 10. 사용자로부터 3개의 수를 키보드로 입력 받아 
	    // 입력 받은 수가 모두 같으면 true, 아니면 false를 출력
		System.out.print("세 정수를 입력하라 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		boolean answer2 = (x == y) && (y == z) ? true : false;
		
		System.out.println(answer2);
	}

}
