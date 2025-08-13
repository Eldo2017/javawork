package _05_interfaceDefault;

/*
  default, static 메소드
   - jdk 8 버전부터 추가된 메소드
   - 단점 보완 목적으로 만들어졌다.
    : interface를 만들어 implements한 클래스가 여러 개면
      나중에 interface에 추상 메소드를 추가하면 implements한 모든 클래스에서
      나중에 추가한 추상 메소드를 모두 구현해야 한다는 단점 존재
      
     > default 메소드 : 구현부가 있다.
     	- 오버라이딩 필요 시 구현을 해도 되고 하지 않아도 된다
     > static 메소드 : 구현부가 있다.
     	- 오버라이딩을 할 수가 없다.
 */

interface Inter1 {
	int method1();
	static String stMe() {
		return "static 메소드";
	}
}

interface Inter2 {
	int method2();
	default String deMe() {
		return "default 메소드 Inter2";
	}
}

public interface Inter extends Inter1, Inter2 {
	int method();
	default String me() {
		return "default 메소드 Inter";
	}
}
