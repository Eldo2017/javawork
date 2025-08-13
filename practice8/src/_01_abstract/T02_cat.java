package _01_abstract;

public class T02_cat extends T01_pet_api {

	T02_cat(){
		this("블랙 봄베이", "검은색", "시크한 츤데레 암컷 냥이 (이름 : 린)");
	}
	
	T02_cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}

	@Override
	void sound() {
		System.out.println("Meow~ Meow~");
	}

	@Override
	void info() {}
	
	
}
