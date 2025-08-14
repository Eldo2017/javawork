package _06_Ex;

public class T01_Ex01_1 {
	/*
	 * 속성 : 
	 * 1) 제목
	 * 2) 저자
	 * 3) 가격
	 * 
	 * 메서드 :
	 * 1) 제목 넣기
	 * 2) 저자 넣기
	 * 3) 가격 넣기
	 * 4) 정보 출력
	 * 
	 * 메인:
	 * 1) 객체 생성
	 * 2) 제목, 저자, 가격 넣기
	 * 3) 정보 출력
	 */
	
	// 속성
	String title;
	String author;
	int price;
	
	// 제목 입력
	void SetTitle(String t) {
		title = t;
	}
	
	// 저자 입력
	void SetAuthor(String a) {
		author = a;
	}
	
	// 가격 입력
	void SetPrice(int p) {
		price = p;
	}
	
	// 정보 출력
	void print() {
		System.out.println("책 제목 : " + title);
		System.out.println("책 저자 : " + author);
		System.out.println("책 가격 : " + price + "원");
	}
}
