package _11_static_Ex;

public class T01_Product_main {

	public static void main(String[] args) {
		T01_Product p1 = new T01_Product();
		T01_Product p2 = new T01_Product();
		T01_Product p3 = new T01_Product();
		
		System.out.println("생산된 총 제품의 갯수 : " + T01_Product.getCount());
		
		T01_Product p4 = new T01_Product();
		T01_Product p5 = new T01_Product();
	
		System.out.println("생산된 총 제품의 갯수 : " + T01_Product.getCount());
	}

}

// T01_Product_main.java