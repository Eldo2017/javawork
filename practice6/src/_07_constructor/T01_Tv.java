package _07_constructor;

public class T01_Tv {
	String company = "Samsung";
	String model;
	int channel;
	int volume;
	
	T01_Tv(String c1, String m, int c2, int v){
		System.out.println("생성자를 호출합니다");
		company = c1;
		model = m;
		channel = c2;
		volume = v;
	}
}
