package _10_polymorphism_ex2;

public class T05_Pets_run {

	public static void main(String[] args) {
		// "시베리안 허스키", "흑백", "활발한 수컷견 (이름: 진)"
		T01_Pets pet1 = new T02_Dogs("시바견", "황색", "2살된 귀염둥이, 수컷견 (이름: 유토)");
		// "블랙 봄베이", "검은색", "귀여운 1살 암컷 냥이 (이름: 린)"
		T01_Pets pet2 = new T03_Cats("터키시 앙고라", "흰색", "귀염둥이 암컷 냥이 (이름: 레이)");
		// "청개구리", "녹색", "말썽쟁이 수컷 아이 (이름: 케이)"
		T01_Pets pet3 = new T04_Frogs("청개구리", "녹색", "말썽쟁이 수컷 아이 (이름: 케이)");
		
		pet1.sound();
		pet2.sound();
		pet3.sound();
		
		pet1.info();
		pet2.info();
		pet3.info();
		
		System.out.println(pet1);
		System.out.println(pet2);
		System.out.println(pet3);
	}

}
