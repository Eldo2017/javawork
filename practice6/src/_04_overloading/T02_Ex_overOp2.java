package _04_overloading;

public class T02_Ex_overOp2 {

	public static void main(String[] args) {
		T02_Ex_overOp1 over = new T02_Ex_overOp1();
		
		System.out.println(over.sub());
		System.out.println(over.sub(4));
		System.out.println(over.sub(17, 4));
		System.out.println(over.sub(14.6, 10.6));
		
		System.out.println("--------------------------");
		
		System.out.println(over.mul());
		System.out.println(over.mul(3));
		System.out.println(over.mul(9, 4));
		System.out.println(over.mul(10.5, 6.1));
		
		System.out.println("--------------------------");
		
		System.out.println(over.div());
		System.out.println(over.div(2));
		System.out.println(over.div(16, 4));
	}

}
