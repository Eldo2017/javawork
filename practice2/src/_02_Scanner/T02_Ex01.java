package _02_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학, 점수를 입력을 받아서 저장 후
		// 합계 점수 및 평균 점수를 출력하라
		
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
		System.out.println("세 과목 평균 : " + avg);
	}

}
