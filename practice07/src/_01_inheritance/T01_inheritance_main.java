package _01_inheritance;

class A {
	int a = 16;
}

class B extends A {
	int b = 28;
}

class C extends A {
	int c = 30;
}

class D extends C {
	int d = 24;
}

public class T01_inheritance_main {

	public static void main(String[] args) {
		A a01 = new A();
		System.out.println(a01.a);
		
		System.out.println("----------------------------------");
		
		B b02 = new B();
		System.out.println(b02.a);
		System.out.println(b02.b);
		
		System.out.println("----------------------------------");
		
		C c03 = new C();
		System.out.println(c03.a);
		System.out.println(c03.c);
		
		System.out.println("----------------------------------");
		
		D d04 = new D();
		System.out.println(d04.a);
		System.out.println(d04.c);
		System.out.println(d04.d);
		
		System.out.println("----------------------------------");
		
		b02.a = 17;
		System.out.println(b02.a);
		System.out.println(c03.a);
		System.out.println(d04.a);
	}

}
