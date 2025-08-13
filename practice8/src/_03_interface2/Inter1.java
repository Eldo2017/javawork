package _03_interface2;

public interface Inter1 {
	// 상수만 사용하라
	public final double PI = 3.14;
	int MAX = 100;
	
	// 메소드는 추상 메소드만 사용이 가능하다
	public abstract void print(int x);
	public abstract void method();
	String str(String name);
	
}
