package _01_opearation;

import java.util.Scanner;

public class T08_Ex03 {

	public static void main(String[] args) {
		// 4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
		// 사용자로부터 인원수와 사탕의 갯수를 입력받아
		// 1인당 동일하게 나눠가진 사탕 개수와
		// 나눠주고 남은 사탕 갯수를 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 : ");
		int count1 = sc.nextInt();
		System.out.print("개수 : ");
		int count2 = sc.nextInt();
		
		int count3 = count2 / count1;
		System.out.println("1인당 동일하게 나눠가진 사탕 수 : " + count3);
		
		int leftover = count2 % count1;
		System.out.println("남은 사탕 수 : " + leftover);
		
		// 5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하기
		// 이 때, 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade1 = sc.nextInt();
		System.out.print("반 : ");
		int classroom = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		String answer1 = (gender == 'M') ? "남" : "여";
		System.out.print("성적(소수점 둘째 자리까지) : ");
		double grade2 = sc.nextDouble();
		
		System.out.println(grade1 + "학년 " + classroom + "반 " + num + "번 " + name + " " + answer1 + "학생의 성적은 " + grade2);
	}
}
