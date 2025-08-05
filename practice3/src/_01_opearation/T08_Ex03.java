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
		
		/* (예시 1)
		 * 이름 : 김두한 
		 * 학년(숫자만) : 1 
		 * 반(숫자만) : 3 
		 * 번호(숫자만) : 2 
		 * 성별(M/F) : M 
		 * 성적(소수점 둘째 자리까지) : 90.16
		 * 
		 * 1학년 3반 2번 김두한 남학생의 성적은 90.16이다.
		 * 
		 * (예시 2)
		 * 이름 : 김무옥 
		 * 학년(숫자만) : 1 
		 * 반(숫자만) : 2 
		 * 번호(숫자만) : 6 
		 * 성별(M/F) : M 
		 * 성적(소수점 둘째 자리까지) : 94.52
		 * 
		 * 1학년 2반 6번 김무옥 남학생의 성적은 94.52이다.
		 * 
		 * (예시 3)
		 * 이름 : 문영철 
		 * 학년(숫자만) : 1 
		 * 반(숫자만) : 1 
		 * 번호(숫자만) : 14 
		 * 성별(M/F) : M 
		 * 성적(소수점 둘째 자리까지) : 92.29
		 * 
		 * 1학년 1반 14번 문영철 남학생의 성적은 92.29이다.
		 */
		
		System.out.print("이름 : "); 
		String name = sc.next();
		System.out.print("학년 : "); 
		int grade1 = sc.nextInt();
		System.out.print("반 : "); 
		int classnum = sc.nextInt();
		System.out.print("번호 : "); 
		int num = sc.nextInt();
		System.out.print("성별(M/F) : "); 
		char gender = sc.next().charAt(0);
		String gen = (gender == 'M') ? "남" : "여";
		System.out.print("성적(소수점 둘째 자리까지) : "); 
		double grade2 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", grade1, classnum, num, name, gen, grade2);
		// System.out.println(grade1 + "학년 " + classnum + "반 " + num + "번 " + name + " " + answer1 + "학생의 성적은 " + grade2);
	}
}
