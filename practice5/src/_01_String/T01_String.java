package _01_String;

public class T01_String {

	public static void main(String[] args) {
		String name = "김두한";
		String hobby = "싸움";

		System.out.println("name : " + name);
		System.out.println("hobby : " + hobby);
		System.out.println("name == hobby : " + (name == hobby));
		
		System.out.println("-------------------------------");
		
		String a = "ssangkal";
		String b = "ssangkal";
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("a == b : " + (a == b));
		
		System.out.println("-------------------------------");
		
		String c = new String("야인시대");
		String d = new String("야인시대");
		
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("c == d(주소 동일 여부) : " + (c == d));
		System.out.println("c.equals(d)(값 동일 여부) : " + c.equals(d));
		
		System.out.println("-------------------------------");
		
		String e = "김두한";
		
		System.out.println("name == e : " + (name == e));
		
		System.out.println("-------------------------------");
		
		
		
	}

}
