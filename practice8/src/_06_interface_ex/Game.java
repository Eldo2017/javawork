package _06_interface_ex;

public class Game implements product {

	private boolean power = false;
	private int vol1;
	private String cG;
	
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
	
	public void changeGame(String newGame) {
		cG = newGame;
		System.out.println("현재 게임 : " + cG);
	}
	
}
