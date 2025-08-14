package _01_String;

public class T02_type_casting {

	public static void main(String[] args) {
		// 문자 -> 숫자
		String a = "17";
		int num1 = Integer.parseInt(a);
		
		System.out.println(num1 + 100);
		System.out.println(a + 100);
		
		System.out.println("-------------------------");
		
		double b = Double.parseDouble(a);
		System.out.println(b + 150);
		
		System.out.println("-------------------------");
		
		// 숫자 -> 문자
		int x = 90;
		String c = String.valueOf(x);
		
		System.out.println(x + 13);
		System.out.println(c + 13);
		
		System.out.println("-------------------------");
		
		double y = 3.14;
		String d = String.valueOf(y);
		
		System.out.println(d + 0.92);
	}

}
