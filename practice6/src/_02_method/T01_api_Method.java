package _02_method;

public class T01_api_Method {
	// 반환형이 없는 메소드라면?
	void print1() {
		System.out.println("반환값이 없고 매개변수도 없는 메소드의 일종");
	}
	
	// 반환형이 있는 메소드라면?
	int print2() {
		System.out.println("반환값이 int형이고 매개변수가 없는 메소드의 일종");

		return 7;
	}
	
	String print3() {
		System.out.println("반환값이 String형이고 매개변수가 없는 메소드");
		
		return "내가 고자라니!";
	}
	
	// 매개변수 = 반환형이 없을 때
	void print4(int b) {
		System.out.println(b);
	}
	
	// 매개변수 = 반환형이 있을 때
	int print5(int c, int d) {
		int res = c * d;
		return res;
	}
	
	String print6(int age, String name, String address) {
		System.out.println("나이 : " + age);
		System.out.println("성명 : " + name);
		System.out.println("주소 : " + address);
		return name;
	}
}
