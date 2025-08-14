package _06_anonym;

class Parent {
	String method() {
		return "부모 재산";
	}
}

class Child extends Parent {
	@Override
	String method() {
		return "자식 재산";
	}
}

public class T01_anonymous_run {

	public static void main(String[] args) {
		Parent p = new Parent();
		
		System.out.println(p.method());

		// 익명 클래스 : 재사용할 필요가 없다면 1번만 정의해 사용
		Parent p2 = new Child() {
			int age = 29;
			@Override
			String method() {
				System.out.println(age);
				return "익명 클래스";
			}
		};
		
	}

}
