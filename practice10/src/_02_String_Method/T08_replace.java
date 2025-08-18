package _02_String_Method;

public class T08_replace {

	public static void main(String[] args) {
		// replace : 글자 치환
		String str = "KamenRider gavv valen rider Vram";
		String newStr = str.replace('R', 'r');

		System.out.println(newStr);
		
		str = "KamenRider gavv valen rider Vram";
		newStr = str.replace("gavv", "가브");
		
		System.out.println(newStr);
		
		// replaceFirst
		str = "KamenRider gavv valen gavv Vram";
		newStr = str.replaceFirst("gavv", "가브");
		System.out.println(newStr);
		
		// replaceAll : 결과는 replace와 동일. 단지 정규 표현식 지원을 한다.
		str = "KamenRider gavv valen gavv Vram";
		newStr = str.replaceAll("gavv", "가브");
		System.out.println(newStr);
	}

}
