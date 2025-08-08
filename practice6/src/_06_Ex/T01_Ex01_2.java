package _06_Ex;

public class T01_Ex01_2 {

	public static void main(String[] args) {
		 //객체 생성
		 T01_Ex01_1 book = new T01_Ex01_1();
		 
		 // 정보 입력
		 book.SetTitle("마녀와 과자집");
		 book.SetAuthor("카사하라 쇼마");
		 book.SetPrice(33000);

		 // 정보 출력
		 book.print();
	}

}
