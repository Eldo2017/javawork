package _02_String_Method;

public class T07_lastIndexOf {
	/*
	 * lastIndexOf() : 뒤에서부터 살펴본다.
	 * lastIndexOf(char) : 뒤에서부터 찾아서 char의 문자의 인덱스 번호 반환
	 * lastIndexOf(char, fromIndex) : fromIndex 번호로부터 찾아서 char 문자를 찾아 인덱스 번호 반환
	 * lastIndexOf(String) : 뒤에서부터 문자열의 시작 인덱스 번호를 반환
	 * lastIndexOf(String, fromIndex) : fromIndex 번호로부터 문자열의 시작 인덱스 번호를 반환
	 */
	public static void main(String[] args) {
		String str = "FusionSynchroXyz";
		System.out.println(str.lastIndexOf('X'));
		System.out.println(str.lastIndexOf("Xyz"));
		
		// fromIndex는 인덱스 앞을 보고, 문자열이 걸쳐져 잇다면 그 문자열도 찾는다.
		System.out.println(str.lastIndexOf("Synchro",6));
		
		System.out.println(str.lastIndexOf("Fusion",6));
		System.out.println(str.lastIndexOf("Fusion",5));
	}

}
