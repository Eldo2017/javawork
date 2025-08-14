package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T09_multicatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int[] num = new int[2];
			System.out.print("나누기 할 정수 2개를 입력하라 : ");
			num[0]=sc.nextInt();
			num[1]=sc.nextInt();

			System.out.println("몫 : " + num[0]/num[1]);
			System.out.println("나머지 : " + num[0]%num[2]);
		}
		catch(ArithmeticException e) {
			System.out.println("나눌 수 없는 수로 나누셨습니다.");
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println("숫자는 정수만 입력할 수 있습니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 넘어갔습니다.");
		}
	}
}
