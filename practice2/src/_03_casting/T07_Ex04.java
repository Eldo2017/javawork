package _03_casting;

import java.util.Scanner;

public class T07_Ex04 {

	public static void main(String[] args) {
		// 1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하라 : ");
		String name = sc.next(); // 이름
		System.out.print("성별을 입력하라(남/여) : ");
		char gen = sc.next().charAt(0); // 성별
		System.out.print("나이를 입력하라 : ");
		int age = sc.nextInt(); // 나이
		System.out.print("키를 입력하라(cm) : ");
		double height = sc.nextDouble(); // 키
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + gen + " " + name + "님 반갑습니다^^");
	}
}
