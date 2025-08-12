package _05_super;


class Parent3 {
	int x;
	int z;
	Parent3(){
		System.out.println("부모 생성자 호출합니다.");
		x = 9;
		z = 17;
	}
}

class Child3 extends Parent3{
	int x;
	int y;
	
	Child3(){
		System.out.println("자식 생성자 호출합니다.");
		x = 16*7;
		y = 11*3;
	}
}

class GrandChild extends Child3 {
	int x;
	
	GrandChild() {
		System.out.println("자손 생성자 호출합니다.");
		x = 7*3+9;
	}
	
	void xPrint() {
		System.out.println(super.x);
		System.out.println(super.y);
		System.out.println(super.z);
	}
}
public class T03_super_run {

	public static void main(String[] args) {
		GrandChild gChild = new GrandChild();
		System.out.println(gChild.x);
		gChild.xPrint();
	}

}
