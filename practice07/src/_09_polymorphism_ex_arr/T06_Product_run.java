package _09_polymorphism_ex_arr;

public class T06_Product_run {

	public static void main(String[] args) {
		T05_buyer b = new T05_buyer();
		
		T04_Tv tv = new T04_Tv();
		
		b.buy(new T02_computer());
		b.buy(new T03_Game());
		b.buy(tv);
		b.info();
		
		b.buy(new T03_Game());
		b.info();
		System.out.println("-------------------------------------");
		
		
	}

}
