package _02_Scanner;

import java.util.Scanner;

public class T01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan1 = new Scanner(System.in);
		/*
		System.out.print("당신의 이름을 입력하시오 : ");
		String name = scan1.next(); //문자열의 단어를 저장한다
		System.out.println("당신의 이름 : " + name);
		
		System.out.print("당신의 나이를 입력하시오 : ");
		int age = scan1.nextInt(); //정수형 숫자를 저장한다
		System.out.println("당신의 나이 : " + age);
		
		System.out.print("당신의 키를 입력하시오 : ");
		double height = scan1.nextDouble(); //소수점 이하까지의 실수를 저장한다
		System.out.println("당신의 키 : " + height);
		
		System.out.print("당신은 남성입니까(true, false)? ");
		boolean answer = scan1.nextBoolean(); //참인지 거짓인지의 값만 저장한다
		System.out.println("당신은 남성입니까? : " + answer);
		
		scan1.nextLine(); //nextLine을 사전에 한번 선언하여 다음 값을 입력 가능하게 한다
		
		System.out.print("당신의 주소를 입력하시오 : ");
		String address = scan1.nextLine();
		System.out.println("당신의 주소 : " + address);
		*/
		
		System.out.print("당신의 성별을 입력하시오 : ");
		// 예시 : 남자아이, 여자아이
		char gender1 = scan1.next().charAt(0); //index 번호 : 0부터 1까지
		System.out.println("당신의 성별 : " + gender1);
		
		
	}

}
