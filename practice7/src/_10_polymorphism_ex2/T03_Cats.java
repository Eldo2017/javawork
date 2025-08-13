package _10_polymorphism_ex2;

public class T03_Cats extends T01_Pets{
	public T03_Cats(){
		super("터키시 앙고라", "흰색", "귀염둥이 암컷 냥이 (이름: 레이)");
	}
	
	
	public T03_Cats(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	public void sound() {
		System.out.println("Meow~ Meow~");
	}
}
