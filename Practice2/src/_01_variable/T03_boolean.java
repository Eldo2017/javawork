package _01_variable;

public class T03_boolean {

	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		
		System.out.println(x);
		System.out.println(y);
		
		boolean a = 17 < 8;
		System.out.println(a);
		
		int num1 = 19;
		// boolean b = num1; 오류 -> 숫자 19는 참, 거짓 판별이 어렵다
		int num2 = 90;
		
		boolean b = num1 < num2;
		
		System.out.println(b);
		
		// = : 대입 연산자, == : 비교 연산자
		boolean c = num1 == num2;
		System.out.println(c);
	}

}
