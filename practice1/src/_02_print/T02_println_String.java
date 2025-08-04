package _02_print;

public class T02_println_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(3 + 7 + " 문자열 연결");
		System.out.println("강의실 : " + "801호"); //연결해서 보여준다
		// + 기호는 처음에 숫자로 시작하면 연산을 하고
		// 문자열로 시작되면 문자들을 연결
		// 즉, 문자열 뒤에 + 기호가 있다면 그 뒤는 숫자여도 무조건 문자열로 인식 (문자열 연결)
		System.out.println("연산 결과 : " + 4 + 4);
		// 문자열 뒤에 + 기호로 넣으면 뒤에는 숫자로 인식을 원한다면 뒤에 소괄호()로 묶으면 된다
		System.out.println("연산 결과 : " + (6 + 6));
	}
}
