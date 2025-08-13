package _06_interface_ex;

public class Tv implements product {

	private boolean power = false;
	private int vol1;
	private int c1;
	private String message;
	
	@Override
	public void power() {
		power = !power;
		System.out.println(power ? "전원을 키겠습니다" : "전원을 끄겠습니다.");
		
	}

	@Override
	public void volumeUp(int vol2) {
		vol1 += vol2;
		if(vol1 < 0) vol1 = 0;
		System.out.println("현재 음량 : " + vol1);
		
	}

	@Override
	public void volumeDown(int vol2) {
		vol1 -= vol2;
		if(vol1 < 1) vol1 = 1;
		System.out.println("현재 음량 : " + vol1);
		
	}
	
	/*
	 @Override 
	 public int volume(int vol2){
	 	return vol2;
	 } 
	 */
	
	public void channelUp(int c2) {
		c1 += c2;
		if(c1 < 0) c1 = 1;
		System.out.println("현재 채널 : " + c1);
	}
	
	public void channelDown(int c2) {
		c1 -= c2;
		if(c1 < 0) c1 = 1;
		System.out.println("현재 채널 : " + c1);
	}

	@Override
	public void searching(String keyword) {
		message = "TV 전용 검색 : '" + keyword + "' 결과를 표시하겠습니다.";
		System.out.println(message);
		
	}
}
