package _01_opearation;

import java.util.Scanner;

public class T09_Ex04 {

	public static void main(String[] args) {
		// 사용자로부터 나이를 입력받아 13세이하이면 어린이
	    // 14세~19세 이하이면 청소년
	    // 20세 이상이면 성인으로 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하라 : ");
		int age = sc.nextInt();
		
		String answer1 = age >= 20 ? "성인이다" : age >= 14 ? "청소년이다" : "어린이다";
		
		System.out.println(answer1);
		
		// 7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력.
		System.out.print("국어, 영어, 수학 점수 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int avg = (kor + eng + math) / 3;
		String answer2 = ((kor >= 40) && (eng >= 40) && (math >= 40)) && avg >= 60 ? "합격" : "불합격";
		
		System.out.println(answer2);
		
		// 8. 주민번호를 입력받아 남자인지 여자인지 출력
		System.out.print("주민번호 : ");
		String Resnum = sc.next();
		int gendernum = Resnum.charAt(7);
		
		String answer3 = (gendernum % 2 == 1) ? "남자" : "여자";
		
		System.out.println(answer3);
	}

}
