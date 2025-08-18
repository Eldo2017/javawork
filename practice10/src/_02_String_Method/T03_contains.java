package _02_String_Method;

public class T03_contains {

	public static void main(String[] args) {
		// contains : 문자열 내에 찾고자 하는 문자열이 포함되어 있는지 검사
		String str = "카리에스";
		
		boolean res = str.contains("카리");
		System.out.println(res);
		
		if(str.contains("카리"))
			System.out.println("가면라이더 카리에스");
		else
			System.out.println("뮤타 잡졸들");
	}

}
