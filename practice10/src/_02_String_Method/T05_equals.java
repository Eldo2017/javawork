package _02_String_Method;

public class T05_equals {

	public static void main(String[] args) {
		// equals : String 클래스에서 오버라이딩 된 상태로, 값이 같은지 반환
		String str = "zillion";
		
		// equals는 대소문자를 가린다
		System.out.println(str.equals("Zillion"));

		// equalsIgnoreCase : 대소문자를 가리지 않는다
		System.out.println(str.equalsIgnoreCase("ZILLION"));
	}

}
