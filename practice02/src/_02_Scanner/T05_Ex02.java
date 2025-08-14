package _02_Scanner;

import java.util.Scanner;

public class T05_Ex02 {

	public static void main(String[] args) {
		// 예제 01의 평균값을 소수점 형식으로 수정하라
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int score1 = scan.nextInt();
		System.out.println("국어 점수 : " + score1);
		System.out.print("컴퓨터 : ");
		int score2 = scan.nextInt();
		System.out.println("국어 점수 : " + score2);
		System.out.print("수학 : ");
		int score3 = scan.nextInt();
		System.out.println("국어 점수 : " + score3);
		
		int sum = score1 + score2 + score3;
		System.out.println("세 과목 총점 : " + sum);
		
		double avg = sum / 3;
		System.out.printf("세 과목 평균 : %.2f", avg);
	}

}
