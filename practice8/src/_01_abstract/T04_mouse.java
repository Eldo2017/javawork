package _01_abstract;

public class T04_mouse extends T01_pet_api {

	T04_mouse(){
		this("햄스터", "회색", "볼이 토실토실한 여자 아이 (이름 : 미사키)");
	}
	
	T04_mouse(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	@Override
	void sound() {
		System.out.println("Squeak! Squeak!");
	}

	@Override
	void info() {
		System.out.println("특징 : " + getFeature());
	}
	
	
}
