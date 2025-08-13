package _05_interfaceDefault;

public class InterRun {

	public static void main(String[] args) {
		InterClass ic = new InterClass();
		
		System.out.println(ic.method());
		System.out.println(ic.method1());
		System.out.println(ic.method2());
		System.out.println("오버라이딩 하지 않은 default deMe() : " + ic.deMe());
		System.out.println("오버라이딩 하지 않은 default me() : " + ic.me());
		System.out.println("오버라이딩 하지 않은 static deMe() : " + Inter1.stMe());
		
		InterClass2 ic2 = new InterClass2();
		System.out.println("오버라이딩 한 default deMe() : " + ic.deMe());
		System.out.println("오버라이딩 한 default me() : " + ic.me());
		
	}

}
