package _07_constructor;

public class T02_Tv2 {
	String company = "Samsung";
	String model;
	int channel;
	int volume;
	
	T02_Tv2(String company, String model, int channel, int volume){
		System.out.println("생성자를 호출합니다");
		this.company = company;
		this.model = model;
		this.channel = channel;
		this.volume = volume;
	}
}
