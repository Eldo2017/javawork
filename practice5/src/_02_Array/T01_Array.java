package _02_Array;

public class T01_Array {

	public static void main(String[] args) {
		/*
		 * 배열은?
		 * 1. 같은 자료형을 연속된 저장공간에 저장하는 데이터다
		 * 2. 배열의 길이(개수)는 나중에 변경이 안된다 (늘리거나 줄이지 못한다)
		 * 
		 */

		//저장공간만 확보, 값은 나중에
		/*
		 * int arrayInt1[] = new int[10]; 
		 * int[] arrayInt2 = new int[10];
		 */
		
		//배열을 만들면서 값을 바로 넣고 싶다면?
		int[] arrayInt3 = {1,2,3,4,5,6,7};
		
		System.out.println(arrayInt3[2]);
		System.out.println(arrayInt3[3]);
		
		arrayInt3[6]=9;
		
		System.out.println(arrayInt3[6]);
		
		System.out.println("-------------------------------");
		
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[1]);
		System.out.println(arrayInt3[2]);
		System.out.println(arrayInt3[3]);
		System.out.println(arrayInt3[4]);
		System.out.println(arrayInt3[5]);
		System.out.println(arrayInt3[6]);
		
		System.out.println("-------------------------------");
		
		for(int i=0;i<7;i++) {
			System.out.println(arrayInt3[i]);
		}
		
		System.out.println("-------------------------------");
		
		arrayInt3[0]=2;
		arrayInt3[1]=3;
		arrayInt3[2]=5;
		arrayInt3[3]=6;
		arrayInt3[4]=7;
		arrayInt3[5]=9;
		arrayInt3[6]=12;
		
		for(int i=0;i<7;i++) {
			System.out.println(arrayInt3[i]);
		}
		
		System.out.println("-------------------------------");
		
		for(int i=0;i<7;i++) {
			arrayInt3[i]=i*2;
			System.out.println(arrayInt3[i]);
		}
		
		System.out.println("-------------------------------");
		
		int count = 0;
		for(int i=0;i<7;i++) {
			arrayInt3[i]=count;
			count+=4;
			System.out.println(arrayInt3[i]);
		}
		
		System.out.println("-------------------------------");
		
		int a[] = {3,4,7,2,1,9,5,8,6};
		int b[] = new int[10];
		
		System.out.println("a의 길이 : " + a.length);
		System.out.println("b의 길이 : " + b.length);
		
		System.out.println("-------------------------------");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("-------------------------------");
		
		// 문제 : 길이가 5인 배열에
		// for 문을 사용하여 값 0,3,6,9,12를 넣고
		// 값의 합계를 구해 출력
		
		int c[] = new int[5];
		
		int sum = 0;
		
		for(int i=0;i<c.length;i++) {
			c[i]=i*3;
			System.out.print(c[i] + " ");
			sum+=c[i];
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("총합 : " + sum);
		
		System.out.println("-------------------------------");
		
		
	}
}
