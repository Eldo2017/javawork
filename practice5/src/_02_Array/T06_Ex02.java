package _02_Array;

import java.util.Scanner;

public class T06_Ex02 {

	public static void main(String[] args) {
		// 1. 길이 10인 배열을 선언하고 1~10까지 반복문을 
		// 이용하여 순서대로 넣고 출력하기
		int a[] = new int[10];
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		// 2. 길이 10인 배열을 선언하고 1~10까지 반복문을 
		// 이용하여 역순으로 배열 인덱스에 넣고 값 출력
		int b[] = new int[10];
		
		for(int j=b.length-1;j>=0;j--) {
			b[j]=j+1;
			System.out.print(b[j]+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		// 3. 사용자로 부터 입력받은 수 만큼 배열을 만들고
		// 1~입력받은 수를 차례대로 넣어 출력
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력받을 수 : ");
		int max = input.nextInt();
		int c[] = new int[max];
		
		for(int k=0;k<max;k++) {
			c[k]=k+1;
			System.out.print(c[k]+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
		
		// 4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
		// 배열 인덱스를 이용하여 귤 출력
		String d[] = {"사과","귤","포도","복숭아","참외"};
		
		System.out.println(d[1]);
		
		/*
		 * 5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 
		 * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
		 * 인덱스를 출력 
		 * ex) 
		 * 문자열 : application 
		 * 문자 : i 
		 * application에 i가 존재하는 위치(인덱스) : 4 8 
		 * i 개수 : 2
		 */
		System.out.print("문자열을 입력하라 : ");
		String input2 = input.next();
		
		char e[] = input2.toCharArray();
		
		System.out.print("문자를 입력하라 : ");
		char f = input.next().charAt(0);
		
		int count=0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", input2, f);
		
		for(int l=0;l<e.length;l++) {
			if(f == e[l]) {
				System.out.print(l + " ");
				count++;
			}
		}

		System.out.println();
		System.out.println(f + " 개수 : " + count);
		
		/*
		 * 6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 
		 * 사용자로 부터 0~6사이의 숫자를 입력받아 숫자와 같은 요일 출력 
		 * ex. 
		 * 0 ~ 6 사이 숫자 입력 : 4 
		 * 금요일 
		 * 0 ~ 6 사이 숫자 입력 : 7 
		 * 잘못 입력하셨습니다.
		 */
		
		char week[]= {'월','화','수','목','금','토','일'};
		
		System.out.print("0 ~ 6 사이의 숫자를 입력하라 : ");
		int idx = input.nextInt();

		if(idx>=0 && idx<=6) System.out.println(week[idx]+"요일");
		else System.out.println("잘못 입력하셨습니다.");
	}

}
