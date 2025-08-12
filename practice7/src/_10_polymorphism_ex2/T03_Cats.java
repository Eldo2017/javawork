package _10_polymorphism_ex2;

public class T03_Cats extends T01_Pets{
	public T03_Cats(){
		super("블랙 봄베이", "검은색", "길가에서 주운 1살된 암컷 냥이 (이름: 린)");
	}
	
	
	public T03_Cats(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	public void sound() {
		System.out.println("Meow~ Meow~");
	}
}
