package _01_LangPackage;

import java.util.Objects;

/*
  원래 Object 클래스 hashcode()는 객체 주소로 해시코드를 만든다
  equals() 사용으로 오버라이딩해 값으로 비교하도록 만들면
  hashcode()도 오버라이딩으로 논리적으로 두 객체가 같게 만들 수 있다. 
 */

class Equals {
	int value;
	Equals(int value){
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		return value == ((Equals)o).value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value); // value 값 7로 hashCode를 만든다
									// 원래는 주소로 hashCode를 만든다
	}
}

public class T02_hashcode {

	public static void main(String[] args) {
		Equals e1 = new Equals(7);
		Equals e2 = new Equals(7);

		System.out.println(e1.equals(e2));
		System.out.println("e1의 해시코드는 " + e1.hashCode());
		System.out.println("e2의 해시코드는 " + e2.hashCode());
		System.out.println(e1 == e2);
		
		System.out.println("e1의 고유 해시코드 : " + System.identityHashCode(e1));
		System.out.println("e2의 고유 해시코드 : " + System.identityHashCode(e2));
		
		String s1 = new String("Caries");
		String s2 = new String("Caries");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("고유 해시코드 : " + System.identityHashCode(s1));
		System.out.println("고유 해시코드 : " + System.identityHashCode(s2));
	}

}
