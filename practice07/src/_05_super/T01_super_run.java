package _05_super;


class Parent {
	int x = 14;
}

class Child extends Parent{
	int x = 17;
	void Show() {
		int x = 25;
		System.out.println("x = " + x); // 우선순위 : 지역변수 -> 인스턴스 변수 -> 부모 변수
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
public class T01_super_run {

	public static void main(String[] args) {
		Child c = new Child();
		c.Show();
	}

}
