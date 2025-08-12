package _05_super;


class Parent2 {
	int x = 17;
	void Show2() {
		System.out.println("부모 클래스 메소드");
	}
}

class Child2 extends Parent2{
	int x = 22;
	
	void Show() {
		System.out.println("자식 클래스 메소드");
	}
	
	void Show2() {
		Show();
		super.Show2();
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
	
}
public class T02_super_run {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.Show2();
	}

}
