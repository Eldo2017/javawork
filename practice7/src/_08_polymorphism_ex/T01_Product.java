package _08_polymorphism_ex;

public class T01_Product {
	int price;
	int bonus_point;
	
	T01_Product(int price){
		this.price = price;
		bonus_point = (int)(price * 0.07);
	}
}
