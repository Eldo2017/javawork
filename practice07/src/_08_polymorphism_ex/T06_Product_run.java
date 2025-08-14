package _08_polymorphism_ex;

public class T06_Product_run {

	public static void main(String[] args) {
		T05_buyer b = new T05_buyer();
		b.buy(new T02_computer());
		b.buy(new T03_Game());
		b.buy(new T04_Tv());
		System.out.println("현재 잔고 : " + b.money + "원");
		System.out.println("보너스 포인트 : " + b.bonus_point + "점");
		
		System.out.println("-------------------------------------");
		
		b.buy(new T03_Game());
		System.out.println("현재 잔고 : " + b.money + "원");
		System.out.println("보너스 포인트 : " + b.bonus_point + "점");
		
		System.out.println("-------------------------------------");
		
		b.buy(new T04_Tv());
		System.out.println("현재 잔고 : " + b.money + "원");
		System.out.println("보너스 포인트 : " + b.bonus_point + "점");
		
		System.out.println("-------------------------------------");
		
		b.buy(new T02_computer());
		System.out.println("현재 잔고 : " + b.money + "원");
		System.out.println("보너스 포인트 : " + b.bonus_point + "점");
	}

}
