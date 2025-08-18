package _01_LangPackage;

/*
 * tostring()
 * 참조변수를 출력하면 tostring()이 호출되고,
 * 패키지명.클래스명@해시코드(16진수)를 훌력한다.
 */
class Card {
	String kind;
	int num;
	Card(){
		this("Clover",6);
	}
	
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	// toString() 오버라이딩으로 값을 출력하게 한다
	@Override
	public String toString() {
		return kind + ", " + num;
	}
}
public class T03_toString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("Diamond",3);
		Card c3 = null;
		
		System.out.println(c1);
		System.out.println(c1.toString());
		
		System.out.println("--------------------");
		
		System.out.println(c2);
		System.out.println(c2.toString());
		
		System.out.println("--------------------");
		
		System.out.println(c3);
	}

}
