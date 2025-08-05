package _01_opearation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리 연산자 (놀리곱과 논리합)
		/*
		 x   y   논리곱(&&) 논리합(||)
		 0   0     0        0
		 0   1     0        1
		 1   0     0        1
		 1   1     1        1
		 */
		int x = 16;
		int y = 28;
		
		boolean answer1 = x > y && x < y;
		//                  f(0)  &&  t(1) -> false
		boolean answer2 = x > y || x < y;
		//                  f(0)  ||  t(1) -> true
		System.out.println("논리곱 : " + answer1);
		System.out.println("논리합 : " + answer2);
		System.out.println("-----------------------------");
		
		// ! : not
		boolean answer3 = x >= y;
		System.out.println(answer3);
		System.out.println(!answer3);
		System.out.println(!!answer3);
		System.out.println("-----------------------------");
		
		// A : 65, a : 97
		char c1 = 'X';
		char c2 = 'c';
		// 대문자라면? 65에서 96까지 사이
		// 소문자라면? 97에서 128까지 사이
		boolean answer4 = c1 >= 'a' && c1 <= 'z'; 
		//                97, 98, 99, ... 126, 127, 128
		boolean answer5 = c1 >= 'A' && c1 <= 'Z';
		//                65, 66, 67, ... 94, 95, 96
		boolean answer6 = c2 >= 'a' && c2 <= 'z';
		boolean answer7 = c2 >= 'A' && c2 <= 'Z';
		System.out.println("c1 : " + c1);
		System.out.println("소문자인가 : " + answer4);
		System.out.println("대문자인가 : " + answer5);
		System.out.println("소문자인가 : " + answer6);
		System.out.println("대문자인가 : " + answer7);
	}
}
