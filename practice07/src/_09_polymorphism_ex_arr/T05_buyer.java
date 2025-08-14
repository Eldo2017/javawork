package _09_polymorphism_ex_arr;

public class T05_buyer {
	int money = 10000000;
	int bonus_point;
	T01_Product[] cart = new T01_Product[10];
	int idx = 0;
	
	void buy(T01_Product p) {
		if(money < p.price) System.out.println("잔액이 모자랍니다.");
		else {
			money -= p.price;
			bonus_point += p.bonus_point;
			cart[idx++] = p;
			System.out.println(p + "를(을) 구입하셨군요."); 
		}
	}
	
	void info() {
		int sum = 0;
		String list = "";
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) break;
			
			sum+=cart[i].price;
			list += cart[i] + ", ";
		}
		System.out.println("구입한 물품들의 총액 : " + sum + "원입니다.");
		System.out.println("구입한 물품 목록 : " + list);
	}
}