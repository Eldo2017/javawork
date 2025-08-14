package _03_casting;

import java.util.Scanner;

public class T05_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 점수는? ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		System.out.println("당신의 점수 (국어: " + kor + ", 영어 : " + eng + ", 수학 : " + math + ")");
		int sum = kor + eng + math;
		float avg = (float)sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
	}
}
