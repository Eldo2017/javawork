package _04_Wrapper;

public class T02_boxing {

	public static void main(String[] args) {
		/*
		 * unboxing : 참조자료형 -> 기본자료형으로 바꾼다
		 * boxing : 기본자료형 -> 참조자료형으로 바꾼다
		 * 
		 * valueOf() : Integer 객체에서 int형 값을 추출하는 메소드
		 * 			   Integer -> 언박싱 -> int형 반환 
		 */
		
		// 자동 언박싱(unboxing)
		Integer a = Integer.valueOf(100);
		int b = a;
		
		Character ch = 'x';
		char c = ch;
		
		int e = Integer.parseInt("100");
		int f = Integer.valueOf("100");
		
		// 박싱(boxing) : valueOf() 사용
		int g = 16;
		Integer h = Integer.valueOf(g);
		
		String str = "29";
		Integer i = Integer.valueOf(str); 
		
		// double형도 이와 같은 방법으로 할 수 있다
		double j = 1.9;
		Double k = Double.valueOf(j);	
	}
}
