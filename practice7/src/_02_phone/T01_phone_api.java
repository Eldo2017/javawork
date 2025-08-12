package _02_phone;

public class T01_phone_api {
	String model;
	String color;
	
	T01_phone_api(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	void bell() {
		System.out.println("벨을 울리겠습니다.");
	}
	
	void hangingUp() {
		System.out.println("전화를 받겠습니다.");
	}
	
	void sending(String message) {
		System.out.println("나 : " + message);
	}
	
	void receving(String message) {
		System.out.println("상대방 : " + message);
	}
	
	void hangingOut() {
		System.out.println("전화를 끊겠습니다.");
	}
}
