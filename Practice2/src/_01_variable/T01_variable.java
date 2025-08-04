package _01_variable;

public class T01_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 기본 자료형
		 * 정수 : 4 바이트 (int)
		 * 실수 : 8 바이트 (double)
		 * 참, 거짓 : boolean
		 * 문자 1개 : char
		 */
		/*
		 * 정수
		 * byte : 1 바이트
		 * short : 2 바이트
		 * int : 4 바이트
		 * long : 8 바이트 : 숫자 뒤에 L자를 붙인다
		 * 
		 * 실수
		 * float : 4 바이트 : 숫자 뒤에 F자를 붙인다
		 * double : 8 바이트
		 */
		int x1;
		int y1 = 8;
		
		x1 = 9;
		
		System.out.println(x1);
		System.out.println(y1);
		
		System.out.println(x1 + y1);
		System.out.println(x1 * 3 + y1);
		
		int res = x1 * 3 + y1;
		System.out.println(res);
		System.out.println(res / 5);
		
		long x2 = 7000000000000l;
		
		System.out.println(x2);
		
		double y2 = 15.21659871;
		
		System.out.println(y2);
		
		float z1 = 15.216598871f;
		
		System.out.println(z1);
	}
}
