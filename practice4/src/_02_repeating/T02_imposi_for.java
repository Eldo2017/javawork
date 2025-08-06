package _02_repeating;

public class T02_imposi_for {

	public static void main(String[] args) {
		/*
		 * for(){ 
		 * 		for(){
		 * 
		 * 		} 
		 * }
		 */

		int i, j;
		for(i=1;i<=3;i++) {
			for(j=6;j<=10;j++) {
				System.out.println("i = " + i + ", j = "+j);
			}
		}
		System.out.println("-----------------------------");
		
		//예제) 구구단 출력하기
		/*
		 * 2*1=2 
		 * 2*2=4 
		 * 2*3=6 
		 * 2*4=8 
		 * ...
		 * 2*9=18
		 * 
		 * 3*1=3
		 * 3*2=6
		 * 3*3=9
		 * 3*4=12
		 * ...
		 * 
		 * 9*9=81
		 */
		
		for(i=2;i<10;i++) {
			for(j=1;j<10;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("---------------------");
		}
		
		System.out.println("-----------------------");
		
		for(i=1;i<10;i++) {
			for(j=2;j<10;j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println();
		}
	}

}
