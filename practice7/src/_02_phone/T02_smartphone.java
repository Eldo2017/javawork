package _02_phone;

public class T02_smartphone extends T01_phone_api {
	
	T02_smartphone(String model, String color){
		super(model, color); // super() : 부모 생성자
	}
	String search;
	
	String search(String search) {
		this.search = search + "Shin";
		
		return this.search;
	}
}

