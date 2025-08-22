package _05_Tree_map;

import java.util.List;

public class BookRun {

	public static void main(String[] args) {
		
		// 1. LibraryController 객체 생성 (Member를 함께 전달)
		LibraryController l1 = new LibraryController(new Member("김두한",23,"남자"));
		
		// 2. member 정보 출력
		l1.info();
		
		// 3. 기본 책 3권 넣기
		l1.insertBook();
		
		// 4. 책 한권 더 추가
		l1.insertBook(new Book("마녀의 여행","시라이시 죠기","소미미디어"));
		
		System.out.println("-----------------------------------------------");
		
		// 5. 전체 책 목록
		System.out.println("=== 전체 책 목록 ===");
		
		for(Book b : l1.selectAll()) {
			System.out.println(b);
		}
		
		System.out.println("-----------------------------------------------");
		
		// 6. 책 제목으로 검색
		System.out.println("=== 책 검색 결과 ===");
		
		Book search1 = l1.searchBook("마녀의 여행");
		
		if(search1 != null) {
			System.out.println("검색 성공!");
			System.out.println(search1);
		}
		else {
			System.out.println("검색 결과 없음");
		}
	}
}
