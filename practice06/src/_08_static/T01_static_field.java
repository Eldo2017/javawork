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
	/*
	 	정적 필드(메소드)만 사용 가능
	 	- 정적 필드(메소드)는 객체를 사용하지 않고도 사용 가능한데
	 	  인스턴스 필드(메소드)는 반드시 객체가 생성되어야지만 사용 가능하다
	 	**  정적 필드에서 인스턴스 필드를 사용하려면 반드시 객체가 생성되어 있다는 것을 담보할 수 없다 **
	 */
	static void method3() {
		System.out.println("정적 메소드 method3()");
		System.out.println(stx);
		// System.out.println(x); // 사용할 수 없다 -> 객체 생성 필수
	}
	
	static String method4() {
		System.out.println("정적 메소드 method4()");
		return stname;
	}
}
