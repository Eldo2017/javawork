package _01_condition;

import java.util.Scanner;

public class T03_else_if {

	public static void main(String[] args) {
		// 사용자로부터 점수를 입력받아서 학점을 출력하라
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하라 : ");
		int score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("점수를 잘못 입력했다");
		}
		else if(score >= 90) {
			System.out.println("A학점");
		}
		else if(score >= 80) {
			System.out.println("B학점");
		}
		else if(score >= 70) {
			System.out.println("C학점");
		}
		else if(score >= 60) {
			System.out.println("D학점");
		}
		else
			System.out.println("F학점");
		
		/*
		  if(score > 100 || score < 0) { System.out.println("점수를 잘못 입력했다"); }
		  else if(score >= 90 && score <= 100) { System.out.println("A핫점"); }
		  else if(score >= 80 && score < 90) { System.out.println("B학점"); }
		  else if(score >= 70 && score < 80) { System.out.println("C학점"); }
		  else if(score >= 60 && score < 70) { System.out.println("D학점"); }
		  else { System.out.println("F학점"); }
		 */
	}

}
