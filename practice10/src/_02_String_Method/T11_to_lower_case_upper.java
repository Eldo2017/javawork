package _02_String_Method;

import java.util.Scanner;

public class T11_to_lower_case_upper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "Kamen Rider Dorado";
		
		String lower = str.toLowerCase();
		System.out.println(lower);

		System.out.println(str.toUpperCase());
		
		// 사용자로부터 찾고자 하는 글자를 입력받아 그 글자가 포함돼있는 str에 그 글자가 포함돼있는지 확인하라
		// (단, 대소문자는 가리지 않는다는 전제하에 실행하도록 한다)
		System.out.print("찾고자 하는 글자 : ");
		
		String word = input.next();
		
		String inputlow = word.toLowerCase();
		
		if(lower.contains(inputlow)) System.out.println("찾는 문자열 내에 있다.");
		else System.out.println("찾는 문자열 내에 없다.");
	}

}
