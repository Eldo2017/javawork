package _03_interface2;

public class InterClass implements Inter1, Inter2 {

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

	@Override
	public int add(int x) {
		return x + 17;
	}

	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
}
