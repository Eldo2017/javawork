package _05_Tree_map;

import java.util.List;

public class BookRun {

	public static void main(String[] args) {
		
		// 1. LibraryController 객체 생성 (Member를 함께 전달)
		LibraryController l1 = new LibraryController(new Member("김두한",23,"남자"));
		LibraryController l2 = new LibraryController(new Member("김무옥",26,"남자"));
		LibraryController l3 = new LibraryController(new Member("문영철",26,"남자"));
		LibraryController l4 = new LibraryController(new Member("신영균",26,"남자"));
		
		// 2. member 정보 출력
		l1.info();
		l2.info();
		l3.info();
		l4.info();
		
		// 3. 기본 책 2권 넣기
		l1.insertBook();
		l2.insertBook();
		l3.insertBook();
		l4.insertBook();
		
		// 4. 책 한권 더 추가
		l1.insertBook(new Book("마녀의 여행","시라이시 죠기","소미미디어"));
		l2.insertBook(new Book("소드아트온라인","카와하라 레키","카오카와 쇼텐"));
		l3.insertBook(new Book("마녀의 여행","시라이시 죠기","소미미디어"));
		l4.insertBook(new Book("우리 딸을 위해서라면, 나는 마왕도 쓰러뜨릴 수 있을지 몰라","CHIROLU","하비재팬"));
		
		System.out.println("-----------------------------------------------");
		
		// 5. 전체 책 목록
		System.out.println("=== 전체 책 목록 ===");
		
		for(Book b : l1.selectAll()) {
			System.out.println(b);
		}
		
		System.out.println("-----------------------------------------------");
		
		for(Book b : l2.selectAll()) {
			System.out.println(b);
		}
		
		System.out.println("-----------------------------------------------");
		
		for(Book b : l3.selectAll()) {
			System.out.println(b);
		}
		
		System.out.println("-----------------------------------------------");
		
		for(Book b : l4.selectAll()) {
			System.out.println(b);
		}
		
		System.out.println("-----------------------------------------------");
		
		// 6. 책 제목으로 검색
		System.out.println("=== 책 검색 결과 ===");
		
		Book search = l1.searchBook("러브라이브");
		
		if(search != null) {
			System.out.println("검색 성공: " + search);
		}
		else {
			System.out.println("검색 결과 없음");
		}
	}
}
