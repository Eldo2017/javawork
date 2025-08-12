package _10_polymorphism_ex2;

public class T04_Frogs extends T01_Pets{
	T04_Frogs(){
		super("청개구리", "녹색", "개울가에서 잡아온 2살된 수컷 아이 (이름: 케이)");
	}
	
	
	T04_Frogs(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	public void sound() {
		System.out.println("Gekko. Gekko.");
	}
}
