package _01_abstract;
/*
  추상 클래스 : 클래스 앞에 abstract 키워드를 사용한다
  			 추상 메소드가 하나 이상 포함이 되어있다면 반드시 추상 클래스로 만들어라
  		- 추상 메소드 : 메소드에 선언부만 있고 내용이 없는(즉, 프로그래밍이 안된) 메소드를 말한다.
  		             ex) void 메소드명(매개변수); -> 추상 메소드 앞에 abstract 붙여라
  		             =>  abstract void 메소드명(매개변수); -> 이게 바로 추상 메소드다
  	> 추상 클래스는 객체를 생성할 수 없다(그러므로 상속을 받아서 사용한다).
 */
abstract public class T01_pet_api {
	private String kind;
	private String color;
	private String feature;
	
	T01_pet_api(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	//추상 메소드 : 상속받는 데에서 반드시 구현해야 한다.
	abstract void sound();
	abstract void info();
	
	// Getter 메소드
	String getKind() {
		return kind;
	}
	
	String getColor() {
		return color;
	}
	
	String getFeature() {
		return feature;
	}
	
	// 오버라이딩
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상: " + color + ", 특징 : " + feature;
	}
}
