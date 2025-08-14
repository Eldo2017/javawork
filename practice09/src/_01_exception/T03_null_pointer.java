package _01_exception;

public class T03_null_pointer {

	public static void main(String[] args) {
		String data = null;
		/*
		 * 참조변수에 주소가 들어있는 경우 출력하면 
			- toString() 호출 -> 패키지명.클래스명@주소
			- 참조변수에 null이 들어있다면, toString() 함수는 호출을 하지 않는다
			- 그대로 null이 나올 뿐이다.
		*/
		/*
		 * System.out.println(data); 
		 * System.out.println(data.toString());
		 */
		
		try {
			System.out.println(data.toString());
		}
		catch (NullPointerException e) {
			System.out.println("데이터가 없습니다.");
			System.out.println("예외 메시지 : " + e);
		}
	}

}
