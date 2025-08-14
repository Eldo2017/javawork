package _01_langPackage;

class A {
	int num = 4;
}

class Point2 implements Cloneable {
	int x;
	int y;
	A a = new A(); // 참조형 변수
	Point2() {}
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Point2 clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// 참조변수도 새로 만들어 객체 주소가 다른 주소가 들어가게 한다.
		A b = a;
		a = new A();
		a.num = b.num;
		
		return (Point2)obj;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y = " + y + ", a.num = " + a.num;
	}
}

public class T06_clone_object {

	public static void main(String[] args) {
		Point2 original = new Point2(1,10);
		Point2 copy = original.clone();
		copy.a.num = 17;
		System.out.println("원본 : " + original);
		System.out.println("복제본 : " + copy);
	}

}
