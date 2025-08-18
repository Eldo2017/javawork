package _02_String_Method;

public class T06_index_of {
	/*
	 * indexOf : 오버로딩이 된 상태. 찾는 문자열이 없다면 -1을, 있다면 그 인덱스 값을 반환한다.
	 * indexOf() : 앞에서부터 살펴본다.
	 * indexOf(char) : 앞에서부터 찾아서 char의 문자의 인덱스 번호 반환
	 * indexOf(char, fromIndex) : fromIndex 번호로부터 찾아서 char 문자를 찾아 인덱스 번호 반환
	 * indexOf(String) : 앞에서부터 문자열의 시작 인덱스 번호를 반환
	 * indexOf(String, fromIndex) : fromIndex 번호로부터 문자열의 시작 인덱스 번호를 반환
	 */
	public static void main(String[] args) {
		String str = "Kamen Rider Gazer";
		int idx = str.indexOf('a');
		System.out.println(idx);
		
		idx = str.indexOf('a', 6);
		System.out.println(idx);
		
		idx = str.indexOf("men", 5);
		System.out.println(idx);
		
		if(str.indexOf("Rider") < 0) {
			System.out.println("라이더가 아니다");
		}
		else {
			System.out.println("라이더다");
		}
	}

}
