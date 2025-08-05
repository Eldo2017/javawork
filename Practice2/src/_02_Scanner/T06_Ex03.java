package _02_Scanner;

import java.util.Scanner;

public class T06_Ex03 {

	public static void main(String[] args) {
		// 예제 : 삼각형의 세 변의 합 및 넓이를 구하라
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 변의 길이를 각각 입력하라: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int sum = x + y + z;
		System.out.printf("%d\n", sum);
		
		System.out.print("높이를 입력하라: ");
		int h = sc.nextInt();
		
		double area = x*h*(0.5);
		System.out.printf("%.1f\n", area);
	}

}
