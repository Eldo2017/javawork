package _02_String_Method;

public class T02_concat {

	public static void main(String[] args) {
		// concat : 두 개의 String 객체를 이어붙여 새로운 문자열로 만든다
		String str1 = "Kamen";
		String str2 = " Rider";

		String str3 = str1.concat(str2);
		
		System.out.println(str3);
	}

}
