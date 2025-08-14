package _01_variable;

public class T02_char {

	public static void main(String[] args) {
		// 문자 1개만 저장 가능하다
		char ch1 = 'x';
		char ch2 = '신';
		char ch3 = '%';

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = 'P';
		char ch5 = 'P' + 1; // 리터럴 값
		
		System.out.println(ch4);
		System.out.println(ch5);
		
		// char ch6 = ch5 + 1; // 오류 -> int형으로 자동 형변환
		
		char ch6 = 'A' + '1'; // 유니코드 A(65) + 유니코드 1(49)
		System.out.println(ch6);
	}

}
