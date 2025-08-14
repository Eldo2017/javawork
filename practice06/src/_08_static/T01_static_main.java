package _08_static;

public class T01_static_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = T01_static_field.stx;
		System.out.println(a);
		System.out.println(T01_static_field.stx);
		
		T01_static_field sf = new T01_static_field();
		System.out.println(sf.x);
		/*
		 * 정적 필드 또는 정적 메소드
		 *  - 클래스명.정적 필드명
		 *  - 클래스명.정적 메소드명
		 *  
		 *  1) 정적 필드는 참조 변수.정적 필드명으로도 사용 가능하다
		 *  2) 그런데 정적 필드는 클래스명.정적 필드명으로 사용하기를 권장한다
		 */
		
		String stname = sf.stname;
		
		T01_static_field.method4();
	}
}
