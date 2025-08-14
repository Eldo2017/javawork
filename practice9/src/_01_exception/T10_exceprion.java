package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_exceprion {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정수 3개를 입력하라(공백으로 구분한다)");
			
			int sum = 0;
			int[] x = new int[3];
			for(int i=0;i<3;i++) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				x[i] = sc.nextInt();
				sum += x[i];
			}
			x[3]=5;
			System.out.println("총 합계 : " + sum);
		}
		catch(Exception e) { // Exception은 모든 예외 클래스의 최상 클래스, 모든 예외 다 받는다
			System.out.println("예외 발생");
			e.printStackTrace();
		}
	}

}
