package _04_overloading;

public class T01_overloading_main {

	public static void main(String[] args) {
		T01_overloading_api over = new T01_overloading_api();
		
		System.out.println(over.add());
		System.out.println(over.add(7));
		System.out.println(over.add(3, 9));
		System.out.println(over.add(1.3, 7.2));
		System.out.println(over.add("사딸라"));
	}

}
