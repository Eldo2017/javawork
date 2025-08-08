package _01_object;

// 실행용으로 사용하는 클래스
public class T01_main_Class {

	public static void main(String[] args) {
		// 라이브러리(또는 API) 사용하기
		// 기본 형식 : 클래스명 변수명 = new 클래스명();
		
		T01_api_Class ob1 = new T01_api_Class(); // 객체 생성 -> 라이브러리를 사용할 수 있다
		System.out.println("첫 번째 객체의 이름 : " + ob1.name);
		System.out.println("첫 번째 객체의 숫자값 : " + ob1.num);
		System.out.println("첫 번째 객체의 참 거짓 여부 : " + ob1.b);
		
		ob1.name = "김두한";
		
		System.out.println("첫 번째 객체의 이름 : " + ob1.name);
		
		T01_api_Class ob2 = new T01_api_Class(); // 객체 생성
		System.out.println("두 번째 객체의 이름 : " + ob2.name);
		
		ob2.name = "미와";
		
		System.out.println("두 번째 객체의 이름 : " + ob2.name);
	}

}
