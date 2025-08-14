package _02_interface;

/*
 * interface : 일종의 추상 클래스. 추상 클래스보다 추상화가 더 높다.
 			   추상 메소드만 포함한다. (일반 메소드는 없다)
 			   추상 메소드와 상수만 멤버로 가질 수 있다. (단, 변수 사용만 못한다.)
 			   객체 생성을 할 수 없다. 
 			   상속을 받는 데에선 implements 키워드를 사용해야 한다. (extends 키워드는 사용을 할 수 없다.)
 			   implements는 다중 상속 또한 가능하다.
 			   
 	- 사용 : 표준 인터페이스 제작하여 어떤 객체가 들어와도 호출 시 이름은 동일하게 호출이 가능하다
 */
public interface Inter {
	// 상수만 사용하라
	public final double PI = 3.14;
	int MAX = 100; // 컴파일 시 public static final을 자동으로 붙여준다
	
	// 메소드는 추상 메소드만 사용이 가능하다
	public abstract void print(int x);
	public abstract void method();
	String str(String name); // 컴파일 시 public abstract를 자동으로 붙여준다
	
}
