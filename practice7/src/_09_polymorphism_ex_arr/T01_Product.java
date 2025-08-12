package _09_polymorphism_ex_arr;

public class T01_Product {
	int price;
	int bonus_point;
	
	T01_Product(int price){
		this.price = price;
		bonus_point = (int)(price * 0.07);
	}
}
