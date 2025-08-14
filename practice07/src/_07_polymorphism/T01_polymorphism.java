package _07_polymorphism;

class A { int a = 10;}
class B extends A { int b = 20;}
class C extends A { int c = 30;}
class D extends A { int d = 40;}
class E extends C { int e = 50;}

public class T01_polymorphism {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		System.out.println("b.a : " + b.a);
		System.out.println("b.b : " + b.b);
		System.out.println("a1.a : " + a1.a);
		// System.out.println("a1.a : " + a1.b); -> A 클래스로 형변환해서 A 클래스만 사용이 가능하다
		System.out.println("a3.a : " + a3.a);
		/*
		 System.out.println("a3.b : " + a3.b); 
		 System.out.println("a3.d : " + a3.d);
		 */
	}

}
