package _07_constructor;

class Book {
	String title;
	String ISBN;
	int price;
	
	Book(){
		this("황금향 엘도라도","7294836107557",25000);
		System.out.println("매개변수가 없는 생성자");
	}
	
	Book(String title){
		this(title,"7294836107557",25000);
		System.out.println("매개변수가 하나(이름)인 생성자");
	}
	
	Book(String title, int price){
		this(title,"7294836107557",price);
		System.out.println("매개변수가 둘(이름, 가격)인 생성자");
	}
	
	Book(String title, String ISBN, int price){
		System.out.println("매개변수가 셋인 생성자");
		this.title = title;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	void printInfo() {
		System.out.println("책 제목 : " + title);
		System.out.println("ISBN : " + ISBN);
		System.out.println("가격 : " + price);
	}
}

public class T04_Ex01 {

	public static void main(String[] args) {
		Book b = new Book();
		b.printInfo();
		
		System.out.println("----------------------------");
		
		b = new Book("과자집의 습격자");
		b.printInfo();
		
		System.out.println("----------------------------");
		
		b = new Book("AI와 인간", 34000);
		b.printInfo();
		
		System.out.println("----------------------------");

		b = new Book("유령 저택의 계략", "9152634452810", 16000);
		b.printInfo();
	}

}
