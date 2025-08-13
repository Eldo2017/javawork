package _01_abstract;

public class T08_smartphone extends T06_phone_api{
	T08_smartphone(){
		this("문영철");
	}

	public T08_smartphone(String owner) {
		super(owner);
	}
	
	@Override
	void hangUp() {
		System.out.println("여보세요? 전화 받겠습니다.");
	}

	@Override
	void hangOut() {
		System.out.println("전화를 끊겠습니다.");
	}
	
	
}
