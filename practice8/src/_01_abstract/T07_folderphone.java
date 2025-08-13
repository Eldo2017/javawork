package _01_abstract;

public class T07_folderphone extends T06_phone_api{
	T07_folderphone(){
		this("김무옥");
	}

	public T07_folderphone(String owner) {
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
