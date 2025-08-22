package _03_Generic_2;

public class Product_Run {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("4_HD 곡면형 TV");

		Tv x1 = p1.getKind();
		System.out.println(x1);
		String y1 = p1.getModel();
		System.out.println(y1);
		System.out.println("--------------------------------------");
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("기아 스포티지 9");
		
		Car x2 = p2.getKind();
		System.out.println(x2);
		String y2 = p2.getModel();
		System.out.println(y2);
		System.out.println("--------------------------------------");
	}

}
