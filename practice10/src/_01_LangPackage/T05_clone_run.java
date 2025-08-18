package _01_LangPackage;

/*
 * cone() : 복제
 * 1. 반드시 clone하고자 하는 클래스에 implements Clonable 넣어라!
 *    "이 클래스는 복제할 수 있는 클래스다"란 것을 알려주기 위해서다
 * 2. 오버라이딩 안해도 된다
 *    Object 클래스의 clone() 메소드 접근제어자가 protected다.
 *    같은 java.lang 패키지 내에 있어야 한다.
 * 3. 2번과 유사하게 clone()을 오버라이딩해야 한다.
 */

class Point implements Cloneable {
	int x;
	int y;
	Point() {}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Point)obj;
	}
	@Override
	public String toString() {
		return "x = " + x + ", y =" + y;
	}
	*/
	@Override
	public  Point clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Point)obj;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ", y =" + y;
	}
}
public class T05_clone_run {

	public static void main(String[] args) {
		Point original = new Point(4,7);
		Point copy = (Point)original.clone();

		System.out.println("원본 객체 : " + original);
		System.out.println("복제한 객체 : " + copy);
	}

}
