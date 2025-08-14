package _02_interface;

public class InterClass implements Inter {

	@Override
	public void print(int x) {
		System.out.println("받은 값 : " + x);
		
	}

	@Override
	public void method() {
		System.out.println("매개변수 없는 메소드를 호출합니다.");
		
	}

	@Override
	public String str(String name) {

		return "이름: " + name;
	}
	
}
