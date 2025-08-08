package _02_Array;

import java.util.Scanner;

public class T07_Ex03 {

	public static void main(String[] args) {
		// 7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
		// 배열 전체의 합 출력
		Scanner input = new Scanner(System.in);
		
		System.out.print("배열 크기를 입력하라 : ");
		int size = input.nextInt();
		
		int numArr[ ] = new int[size];
		int sum = 0;
		System.out.print("원소 숫자를 입력하라 : ");
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = input.nextInt();
			sum+=numArr[i];
		}
		System.out.println("합계 : " + sum);
		
		/*8. 3 이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		   다시 정수를 받도록 하세요. */

		/*
		 * ex. 정수 : 4 
		 * 다시 입력하세요. 
		 * 정수 : -6 
		 * 다시 입력하세요. 
		 * 정수 : 5 
		 * 1, 2, 3, 2, 1
		 */
		int oddNum;
		
		while(true) {
			System.out.print("홀수를 입력하라(3 이상) : ");
			oddNum=input.nextInt();
			
			if(oddNum < 3||oddNum%2==0)
				System.out.println("다시 입력하라");
			else
				break;
		}
		
		//배열 생성
		int numArr2[] = new int[oddNum];
		int mid = oddNum/2;
		
		for(int i=0;i<oddNum;i++) {
			if(i <= mid) {
				numArr2[i] = i+1;
			}
			else {
				numArr2[i] = oddNum - i; //감소
			}
		}
		
		//출력
		for(int j : numArr2) {
			System.out.print(j + " ");
		}
	}

}
