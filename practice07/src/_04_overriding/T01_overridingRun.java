package _04_overriding;

class Over{
	void Show(String str) {
		System.out.println("부모 클래스 메소드 : " + str);
	}
}

// 이것이 오버라이딩이다
class OverChild extends Over{
	// 오버라이딩 : 부모의 메소드와 원형은 같고, 내용만 다르게 재정의하는 것
	void Show(String child) {
		System.out.println("자식 클래스 메소드 : " + child);
	}
}

public class T01_overridingRun {

	public static void main(String[] args) {
		OverChild oc = new OverChild();
		oc.Show("비터 가브");

		Over ov = new Over();
		ov.Show("가브");
	}

}
