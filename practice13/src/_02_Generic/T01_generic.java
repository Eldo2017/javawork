package _02_Generic;

class Box<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}

class Orange {
	@Override 
	public String toString() {
		return "Orange Arms! Hanamichi On Stage!";
	}
}
class Banana {
	@Override 
	public String toString() {
		return "Banana Arms! Knight Of Spear!";
	}
}

public class T01_generic {

	public static void main(String[] args) {
		Box<String> b1 = new Box<>();
		b1.set("Lupin");
		/*
		 * b1.set(new Orange()); // 예외 발생
		 * b1.set(6); // 예외 발생
		 */ 
		// b1.set("6"); 이건 가능 -> String 형식
		
		System.out.println(b1.get());
		
		Box<Integer> b2 = new Box<>();
		/*
		 * b2.set("7"); 
		 * b2.set("Build"); 
		 * b2.set(24.1917); -> 전부 예외 발생
		 */
		b2.set(20);
		
		System.out.println(b2.get());
		
		Box<Orange> b3 = new Box<>();
		b3.set(new Orange());
		
		System.out.println(b3.get());
		
		// b3.set(new Banana());
	}

}
