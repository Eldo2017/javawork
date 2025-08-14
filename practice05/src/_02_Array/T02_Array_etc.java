package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T02_Array_etc {

	public static void main(String[] args) {
		char a[]= {'x','y','z'};
		String b[] = {"김두한","김무옥","문영철"};
		boolean c[] = {true, false, false, true};
		double d[]= {3.15, 4.19, 6.25, 11.21};
		
		// 문제: 문자열 3개를 넣을 수 있는 배열을 만들어서 사용자로부터 입력받아 넣어라
		// 1번째 이름 입력 : 
		// 2번째 이름 입력 : 
		// 3번째 이름 입력 : 
		
		Scanner x1 = new Scanner(System.in);
		String[] x2 = new String[3];
		
		
		int i;
		
		System.out.print("세 명의 이름 입력 : ");
		for(i=0;i<x2.length;i++) {
			x2[i]=x1.next();
			System.out.print((i+1)+"번째 이름 : ");
			System.out.println(x2[i]);
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(b);
		
		// char는 값이 나옴
		System.out.println(a);
		
	}

}
