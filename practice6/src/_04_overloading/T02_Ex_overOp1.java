package _04_overloading;

public class T02_Ex_overOp1 {
	// -, *, /
	
	int num = 1;
	
	// 매개변수 없는 거, 1개, 2개
	int sub() {
		return num;
	}
	
	int sub(int a) {
		return a;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	
	double sub(double a, double b) {
		return a - b;
	}
	
	int mul() {
		return num;
	}
	
	int mul(int c) {
		return c;
	}
	
	int mul(int c, int d) {
		return c * d;
	}
	
	double mul(double c, double d) {
		return c * d;
	}
	
	int div() {
		return num;
	}
	
	int div(int e) {
		return e;
	}
	
	int div(int e, int f) {
		return e / f;
	}
}
