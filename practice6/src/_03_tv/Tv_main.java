package _03_tv;

public class Tv_main {

	public static void main(String[] args) {
		Tv ob1 = new Tv();
		
		System.out.println("회사명 : " + ob1.company);
		System.out.println("모델명 : " + ob1.model);
		System.out.println(ob1.inch + "인치");
		
		ob1.power();
		
		System.out.println("현재 채널 : " + ob1.channelUp());
		System.out.println("현재 채널 : " + ob1.channelUp());
		
		System.out.println("현재 채널 : " + ob1.channelDown());
		System.out.println("현재 채널 : " + ob1.channelDown());
		System.out.println("현재 채널 : " + ob1.channelDown());
		
		System.out.println("음량 : " + ob1.volume(14));
		
		ob1.power();
	}

}
