package _01_opearation;

import java.util.Scanner;

public class T06_Ex01 {

	public static void main(String[] args) {
		// 사용자로부터 점수를 입력받아서 80점 이상이면 합격, 그렇지 않다면 불합격으로 처리하라
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하라 : ");
		int score = sc.nextInt();
		
		String answer1 = score >= 80 ? "합격" : "불합격";
		String answer2 = score > 100 ? "점수를 잘못 입력함" : score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : score > 0 ? "F" : "점수를 잘못 입력함";
		
		System.out.println(answer1);
		System.out.println(answer2);
	}

}
