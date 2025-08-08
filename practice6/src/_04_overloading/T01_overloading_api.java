package _04_overloading;

public class T01_overloading_api {
	// 오버로딩 조건
	// 1. 메소드 이름이 같아야 한다
	// 2. 매개변수 개수나 자료형이 달라야 한다
	
	int a = 10;
	int add() {
		return a;
	}
	
	int add(int x) {
		return a + x;
	}
	
	int add(int x, int y) {
		return x + y;
	}
	
	double add(double x, double y) {
		return x + y;
	}
	
	String add(String name) {
		return "이름: " + name;
	}
}
