package _07_polymorphism;

class Parent {
	void method1() {
		System.out.println("부모 메소드 1");
	}
	
	void method2() {
		System.out.println("부모 메소드 2");
	}
}

class Child extends Parent {
	@Override
	void method2() {
		System.out.println("자식 메소드 2");
	}
	
	void method3() {
		System.out.println("자식 메소드 3");
	}
}
public class T02_poly_run {

	public static void main(String[] args) {
		Parent p = new Child(); // 자동 형변환
		p.method1();
		// 오버라이딩한 메소드는 형변환과 관계 없이 무조건 오버라이딩한 메소드만 호출한다
		p.method2();
	}

}
