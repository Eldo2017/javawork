package _01_opearation;

public class T01_operation {

	public static void main(String[] args) {
		// 대입연산자
		int x1 = 17;
		
		x1 += 32; // x1 = x1 + 32;
		
		int x2 = 23;
		x2 -= 10; // x2 = x2 - 10;
		
		int x3 = 16;
		x3 *= 4; // x3 = x3 * 4;
		
		int x4 = 60;
		x4 /= 12; // x4 = x4 / 12;
		
		int x5 = 18;
		x5 %= 2; // x5 = x5 % 2;
		
		int x6 = 70_000_000; // 사람이 볼 때 편하게 하기 위해
		
		int res = x6 * 2;
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		
		System.out.println(res);
	}
}
