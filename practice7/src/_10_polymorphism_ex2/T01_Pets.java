package _10_polymorphism_ex2;

public class T01_Pets {
	private String kind; // 종류
	private String color; // 색상
	private String feature; // 특징
	
	public T01_Pets(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	public void sound() {
		System.out.println("각 동물들의 소리");
	}
	
	public void info() {
		System.out.println("종류 : " + kind + ", 색상 : " + color);
	}
	
	public String getKind() {
		return kind;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getFeature() {
		return feature;
	}
	
	@Override
	public String toString() {
		// 예시) 종류 : 블랙 봄베이, 색상 : 검은색, 특징 : 아직 2살밖에 안된 아기 냥이 
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;  
	}
}
