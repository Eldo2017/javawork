package _10_polymorphism_ex2;

public class T02_Dogs extends T01_Pets {
	public T02_Dogs(){
		super("시베리안 허스키", "흑백", "3살된 귀염둥이, 수컷견 (이름: 진)");
	}
	
	
	public T02_Dogs(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	public void sound() {
		System.out.println("Bark! Bark!");
	}
}
