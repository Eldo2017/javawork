package _02_phone;

public class T03_phone_run {

	public static void main(String[] args) {
		T02_smartphone xp = new T02_smartphone("플립5","골드");
		
		System.out.println("모델명 : " + xp.model);
		System.out.println("색상 : " + xp.color);
		
		xp.bell();
		xp.hangingUp();
		xp.sending("전화 받겠습니다.");
		xp.receving("네, 받겠쇼 잉");
		xp.hangingOut();
		
		System.out.println(xp.search("yg") + "을 검색하겠습니다.");
	}

}
