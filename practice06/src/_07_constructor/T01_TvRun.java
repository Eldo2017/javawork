package _07_constructor;

public class T01_TvRun {

	
	public static void main(String[] args) {
		
		T01_Tv tv = new T01_Tv("Samsung", "곡면 LED TV", 16, 10);
		System.out.println("제조사는 "+ tv.company);
		System.out.println("모델은 " + tv.model);
		System.out.println("채널은 " + tv.channel);
		System.out.println("음량은 " + tv.volume);
		
		System.out.println("--------------------------");
		
		T01_Tv tv2 = new T01_Tv("LG", "4HD 울트라 TV", 7, 30);
		System.out.println("제조사는 "+ tv2.company);
		System.out.println("모델은 " + tv2.model);
		System.out.println("채널은 " + tv2.channel);
		System.out.println("음량은 " + tv2.volume);
		
		System.out.println("--------------------------");
		
		T02_Tv2 tv3 = new T02_Tv2("SONY", "슬림 커브 4K TV", 9, 28);
		System.out.println("제조사는 "+ tv3.company);
		System.out.println("모델은 " + tv3.model);
		System.out.println("채널은 " + tv3.channel);
		System.out.println("음량은 " + tv3.volume);
	}
}
