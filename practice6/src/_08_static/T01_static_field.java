package _08_static;

public class T01_static_field {
	// 인스턴스 필드
	int x = 7;
	String name = "신마적";
	
	// 정적 필드
	static int stx = 16;
	static String stname = "구마적";
	
	// 인스턴스 메소드
	/*
	 	인스턴스 필드, 정적 필드 모두 사용 가능
	 */
	void method1() {
		System.out.println("인스턴스 메소드 method1()");
		System.out.println(stx); // 정적 필드 호출 가능
		System.out.println(name); // 인스턴스 필드 호출 가능
	}
	
	String method2() {
		System.out.println("인스턴스 메소드 method2()");
		return stname;
	}
	
	// 정적 메소드
	static void method3() {
		System.out.println("정적 메소드 method3()");
		System.out.println(stx);
		// System.out.println(x); // 사용할 수 없다
	}
	
	static String method4() {
		System.out.println("정적 메소드 method4()");
		return stname;
	}
}
