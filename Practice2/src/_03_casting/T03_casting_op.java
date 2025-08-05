package _03_casting;

public class T03_casting_op {

	public static void main(String[] args) {
		// int형보다 작은 자료형의 연산은 모두 int로 자동 변환이 된다
		byte b1 = 16;
		byte b2 = 32;
		
		// byte res = b1 + b2; -> 오류
		int res1 = b1 + b2;
		
		System.out.println(res1);
		
		char c1 = 'A';
		// char c2 = c1 + 7; -> 오류
		
		int c2 = c1 + 7; // 이렇게 해야 정상이다
		// c2를 문자로 출력한다고 하면
		char c3 = (char)c2;
		
		int x = 160;
		int y = 7;
		int z = x / y; // int / int = int : 몫만 남는다
		
		double d1 = 9;
		double res_ex = x / d1;
		int res2 = (int)(x / d1);
		// or
		int res3 = x / (int)d1;
		
		System.out.println(c2);
		System.out.println(c3);
		// or
		System.out.println((char)c2);
		
		System.out.println(z);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res_ex);
	}

}
