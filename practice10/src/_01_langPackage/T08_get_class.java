package _01_langPackage;

class Card2 {
	String kind;
	int num;
	Card2(){
		this("Clover",6);
	}
	
	Card2(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	// toString() 오버라이딩으로 값을 출력하게 한다
	@Override
	public String toString() {
		return kind + ", " + num;
	}
}
public class T08_get_class {

	public static void main(String[] args) {
		Card2 c1 = new Card2("Heart",8);
		System.out.println(c1);
		System.out.println(c1.getClass());
		System.out.println(c1.getClass().getName());
	}

}
