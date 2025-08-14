package _03_tv;

public class Tv {
	// 속성
	String company = "Samsung";
	String model = "커브 LED TV";
	int inch = 95;
	boolean power = false;
	int vol;
	int channel = 5;
	// 기능 = 메소드
	void power() {
		/*
		 * power = true; // 1번 호출했을때 
		 * power = false; // 2번 호출했을때
		 */		
		power = !power;
		if(power) System.out.println("TV 전원 켜짐");// or power == true
		else System.out.println("TV 전원 꺼짐");
	}
	
	int channelUp() {
		channel++;
		return channel;
	}
	
	int channelDown() {
		channel--;
		return channel;
	}
	
	int volume(int volInput) {
		vol = volInput;
		return vol;
	}
}
