package _08_static;

public class T01_static_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = T01_static_field.stx;
		System.out.println(a);
		System.out.println(T01_static_field.stx);
		
		T01_static_field sf = new T01_static_field();
		System.out.println(sf.x);
	}
}
