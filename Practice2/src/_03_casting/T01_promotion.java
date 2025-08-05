package _03_casting;

public class T01_promotion {

	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = b1; // byte -> short
		
		int i1 = b1; // byte -> int
		i1 = s1;
		
		char c1 = '철';
		int i2 = c1; // char -> int
		
		double d1 = i1; // int -> double
		
		int i3 = s1 + 1;
		int i4 = c1 + 1;
		
		int i5 = b1 + s1;
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);

		System.out.println(c1);
		System.out.println(i2);
		System.out.println(d1);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

}
