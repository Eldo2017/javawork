package _01_abstract;

public class T03_dog extends T01_pet_api {

	T03_dog(){
		this("시바견", "황색", "말썽쟁이 수컷견 (이름 : 레이)");
	}
	
	T03_dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	@Override
	void sound() {
		System.out.println("Bark! Bark!");
	}

	@Override
	void info() {
		System.out.println("종류 : " + super.getKind());
	}
	
	
}
