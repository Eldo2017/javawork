package _01_condition;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		// switch ~ case
		int x1 = 5;
		
		switch(x1) {
		case 1:
			System.out.println("X");
			break;
		case 2:
			System.out.println("Y");
			break;
		case 3:
			System.out.println("Z");
			break;
		default:
			System.out.println("값을 잘못 입력했다");
			break;
		}
		
		System.out.println("=========================");
		
		char c = 'Z';
		
		switch(c) {
		case 'W':
			System.out.println("2층");
			break;
		case 'X':
			System.out.println("3층");
			break;
		case 'Y':
			System.out.println("1층");
			break;
		case 'Z':
			System.out.println("4층");
			break;
		}
		
		System.out.println("=========================");
		
		int month = 9;
		/*
		 * switch(month) { 
		 * case 1: 
		 * 		System.out.println("겨울"); 
		 * 		break; //12개 
		 * }
		 */
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
			//12개
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		}
		
		System.out.println("=========================");
		
		/*
		 * (예시)
		 * 
		 * String str = "김두한";
		 * 
		 * switch(str) { 
		 * case "김두한": 
		 * 		System.out.println("당신은 김두한과 짝이 되었습니다."); 
		 * 		break;
		 * case "김무옥": 
		 * 		System.out.println("당신은 김무옥과 짝이 되었습니다."); 
		 * 		break; 
		 * case "문영철":
		 * 		System.out.println("당신은 문영철과 짝이 되었습니다."); 
		 * 		break; 
		 * case "김영태":
		 * 		System.out.println("당신은 김영태와 짝이 되었습니다."); 
		 * 		break; 
		 * default:
		 * 		System.out.println("꽝"); 
		 * 		break; 
		 * }
		 */
		
		// 문제 1: 사용자로부터 연산자(+, -, *, /, %) 및 숫자 2개를 입력받아서 연산 결과를 출력하라
		// 단, switch case문만 인정한다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 : ");
		char op = sc.next().charAt(0);
		
		System.out.print("연산할 두 수 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		switch(op) {
		case '+':
			System.out.println("두 수를 더한 값 : " + (x + y));
			break;
		case '-':
			System.out.println("두 수를 뺀 값 : " + (x - y));
			break;
		case '*':
			System.out.println("두 수를 곱한 값 : " + (x * y));
			break;
		case '/':
			System.out.println("두 수를 나눈 몫 : " + (x / y));
			break;
		case '%':
			System.out.println("두 수를 나눈 나머지 : " + (x % y));
			break;
		default:
			System.out.println("연산이 잘못됐다.");
			break;
		}
		
		System.out.println("=========================");
		
		if(op == '+')
			System.out.println("두 수를 더한 값 : " + (x + y));
		else if(op == '-')
			System.out.println("두 수를 뺀 값 : " + (x - y));
		else if(op == '*')
			System.out.println("두 수를 곱한 값 : " + (x * y));
		else if(op == '/')
			System.out.println("두 수를 나눈 몫 : " + (x / y));
		else if(op == '%')
			System.out.println("두 수를 나눈 나머지 : " + (x % y));
		else {
			System.out.println("연산이 잘못됐다.");
		}
	}
}
