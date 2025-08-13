package _01_abstract;

public class T05_pet_run {

	public static void main(String[] args) {
		// 추상 클래스는 객체 생성을 못한다.
		// T01_pet_api pet1 = new T01_pet_api("샴고양이","흰색","똑똑한 암컷 냥이 (이름 : 로제)") -> 오류

		T01_pet_api pet1 = new T04_mouse("생쥐","회색","뚱뚱한 수컷찍찍이 (이름: 켄)"); // 다형성 -> 추상클래스는 형변환이 가능하다
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		
		System.out.println("-------------------------------------");
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("-------------------------------------");
		
		pet1 = new T02_cat("블랙 봄베이","검은색","귀염둥이 암컷 냥이 (이름: 린)");
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		
		System.out.println("-------------------------------------");
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("-------------------------------------");
		
		pet1 = new T03_dog("시베리안 허스키","흑백","듬직한 수컷견 (이름: 진)");
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음소리 : ");
		pet1.sound();
		
		System.out.println("-------------------------------------");
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("-------------------------------------");
	}

}
