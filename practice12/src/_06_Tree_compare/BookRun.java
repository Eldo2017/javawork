package _06_Tree_compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRun {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LibraryController controller = new LibraryController();
		
		System.out.println("================= 메뉴 ==================");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 전체 도서 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서명 오름차순 정렬");
		System.out.println("0. 종료");

		System.out.println("----------------------------------------");
		
		while(true) {
			System.out.print("무엇을 하시겠습니까? ");
			int num = input.nextInt();
			input.nextLine(); // 개행 방지
			
			switch(num) {
			case 1: // 새 도서 추가
				System.out.println("=== 도서 추가 ===");
				System.out.print("제목 : ");
				String title = input.nextLine();
				System.out.print("저자 : ");
				String author = input.nextLine();
				System.out.print("범주 : ");
				String category = input.nextLine();
				System.out.print("가격 : ");
				
				if(!input.hasNextInt()) {
					System.out.println("가격은 숫자로 입력하시오");
					input.nextLine();
					break;
				}
				
				int price = input.nextInt();
				input.nextLine();
				
				controller.insertBook(new Book(title, author, category, price));
				System.out.println("도서가 추가되었습니다.");
				System.out.println("-------------------");
				break;
				
			case 2: // 전체 도서 조회
				List<Book> list = controller.selectList();
				if(list.isEmpty()) {
					System.out.println("등록된 도서가 없습니다.");
				}
				else {
					System.out.println("=== 전체 도서 목록 ===");
					for(Book b : list) System.out.println(b);
					System.out.println("-------------------");
				}
				break;
				
			case 3: // 도서 검색 (제목에 키워드 포함)
				System.out.print("검색 키워드(제목): ");
				String keyword = input.nextLine();
				ArrayList<Book> result = controller.searchBook(keyword);
				if(result.isEmpty()) System.out.println("검색 결과가 없습니다.");
				else {
					System.out.println("=== 검색 결과 ===");
					for(Book b : result) System.out.println(b);
					System.out.println("---------------");
				}
				break;
				
			case 4: // 도서 삭제 (제목, 저자 일치)
				System.out.print("삭제할 도서 제목 : ");
				String title2 = input.nextLine();
				System.out.print("삭제할 도서 저자 : ");
				String author2 = input.nextLine();
				
				Book deleted = controller.deleteBook(title2, author2);
				
				if(deleted == null) {
					System.out.println("일치하는 도서를 찾을 수 없습니다.");
				}
				else {
					System.out.println("삭제되었습니다. " + deleted);
				}
				
				break;
				
			case 5: // 도서명 오를차순 정렬
				int res = controller.ascBook();
				if(res == 1) {
					System.out.println("도서명이 오름차순으로 정렬되었습니다.");
					for(Book b : controller.selectList()) System.out.println(b);
					System.out.println("---------------------------");
				}
				break;
				
			case 0: // 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				input.close();
				return;
				
			default:
				System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
		}
	}
}
