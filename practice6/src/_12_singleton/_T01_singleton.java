package _12_singleton;

/*
 	싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들게 보장하는 기법
 	- 사용하는 이유 : 최초로 만들어진 객체를 재활용하기 위해
 				   생성자를 통하여 여러 번 호출이 되어도 객체는 새로 생성하지 않는다
 	- 장점 : 메모리 낭비를 방지할 수 있다.
 	- 단점 :
 	  1) 의존성이 높아진다
 	  2) private 생성자를 이용하므로 상속이 불가능하다
 	  3) 테스트에도 불리하다
 	- 용도 : 데이터베이스 연동
 */


class singleton {
	// 정적 필드로 생성자 만들어야 접근이 가능하다
	// private로 외부에서 접근 못하게 막는다
	private static singleton s = new singleton();
	
	// 객체를 생성할 수 없도록 막는다
	private singleton(){
		System.out.println("객체를 생성합니다.");
	}
	
	// getter 메소드. static을 붙이지 않으면 인스턴스 메소드는 객체를 생성할 수 없어서 사용을 할 수가 없다.
	static singleton getSingleton() { // 인스턴스 메소드 -> 정적 메소드
		return s;
	}
	
	// setter 메소드
}
public class _T01_singleton {

	public static void main(String[] args) {
		singleton s1 = singleton.getSingleton();
		System.out.println(s1);
		
		singleton s2 = singleton.getSingleton();
		System.out.println(s2);
	}

}
