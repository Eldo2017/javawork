package _05_Tree_map;

import java.util.ArrayList;

public class LibraryController {
	private Member member; // 단일 멤버 객체
	private ArrayList<Book> aList = new ArrayList<>();
	
	// 생성자
	public LibraryController(Member member) {
		this.member=member;
	}
	
	// member 정보 출력
	public void info() {
		System.out.println(member.toString());
	}
	
	// 책을 미리 몇 권 넣어두는 메소드
	public void insertBook() {
		aList.add(new Book("명탐정코난","아오야마 고쇼","쇼가쿠칸"));
		aList.add(new Book("소년탐정 김전일","아마기 세이마","코단샤"));
	}
	
	// 외부에서 받은 책을 리스트에 넣기
	public void insertBook(Book book) {
		aList.add(book);
	}
	
	// 전체 책 목록 반환
	public ArrayList<Book> selectAll(){
		return aList;
	}
	
	// 제목으로 책 검색하기
	public Book searchBook(String bookTitle) {
		Book book = null;
		for(Book b : aList) {
			if(b.getTitle().equals(bookTitle)) {
				book = b;
				break;
			}
		}
		return book;
	}
}
