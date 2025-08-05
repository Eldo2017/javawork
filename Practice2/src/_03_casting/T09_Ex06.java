package _03_casting;

import java.util.Scanner;

public class T09_Ex06 {

	public static void main(String[] args) {
		// 3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력
		// 계산 공식 ) 면적 : 가로 * 세로, 둘레 : (가로 + 세로) * 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		System.out.println("면적 : " + area);
		double cm = (width + height) * 2;
		System.out.println("둘레 : " + cm);
	}

}
