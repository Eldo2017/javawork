package _08_polymorphism_ex;

public class T05_buyer {
	int money = 10000000;
	int bonus_point;
	
	void buy(T01_Product p) {
		if(money < p.price) System.out.println("잔액이 모자랍니다.");
		else {
			money -= p.price;
			bonus_point += p.bonus_point;
			System.out.println(p + "를(을) 구입하셨군요."); 
		}
	}
}