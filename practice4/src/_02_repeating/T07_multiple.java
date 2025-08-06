package _02_repeating;

public class T07_multiple {

	public static void main(String[] args) {
		int i, j, k;
		
		// for 문에 여러개 변수를 사용할 때
		// ** 주의 : 조건식에는 변수가 하나만 들어간다
		for(i=1,j=20;j>10; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}
		
		System.out.println("---------------------");
		
		for(i=1, j=20, k=30;j>10; i++, j--, k+=5) {
			System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		}
		
		System.out.println("---------------------");
		
		int x, y, z;
		x = y = z = 12;
		// while(true) 문과 같은 뜻
		for(;;) {
			System.out.println(x++);
			if(x==16) break;
		}
	}
}
