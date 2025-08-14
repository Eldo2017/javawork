package _02_String_method;

public class T01_charArray {

	public static void main(String[] args) {
		String str1 = new String("나 김두한이다");	
		String str2 = "사딸라!";

		char[] chArr = {'김','두','한'};
		String str3 = new String(chArr);
		System.out.println(str3);
		
		char ch = str3.charAt(1);
		System.out.println(ch);
	}

}
