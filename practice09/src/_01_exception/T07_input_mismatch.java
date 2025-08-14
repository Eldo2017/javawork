package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T07_input_mismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하라(공백으로 구분한다)");
		
		int sum = 0;
		for(int i=0;i<3;i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			try {
				int x = sc.nextInt();
				sum += x;
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닌 것을 넣으셨습니다.");
				sc.next();
				i--;
			}
		}
		System.out.println("총 합계 : " + sum);
	}

}
