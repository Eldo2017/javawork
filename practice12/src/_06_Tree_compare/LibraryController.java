package _06_Tree_compare;

import java.util.ArrayList;
import java.util.Comparator;

public class LibraryController {
	ArrayList<Book> list;
	
	// 생성자 : 책 3권 명시적으로 넣기
	public LibraryController() {
		list = new ArrayList<>();
		list.add(new Book("엘도라도","글리온","소설",55000));
		list.add(new Book("파멸의 책","바하트","소설",32000));
		list.add(new Book("암흑의 여우","메라","소설",21000));
	}
	
	//책 추가
	void insertBook(Book book) {
		list.add(book);
	}
	
	// 전체 리스트 반환
	public ArrayList<Book> selectList(){
		return list;
	}
	
	// 제목에 키워드가 포함된 책 검색
	public ArrayList<Book> searchBook(String keyword){
		ArrayList<Book> result = new ArrayList<>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) result.add(b);
		}
		return result;
	}
	
	// 제목과 저자가 일치하는 책 삭제
	public Book deleteBook(String title, String author) {
		for(int i=0;i<list.size();i++) {
			Book b = list.get(i);
			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				list.remove(i);
				return b; // 삭제한 책 반환
			}
		}
		return null; // 못 찾았다면
	}
	
	// 제목 오름차순 정렬
	public int ascBook() {
		list.sort(Comparator.comparing(Book::getTitle));
		return 1;
	}
}
