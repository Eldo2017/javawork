package _01_exception;

public class T11_finally {

	public static void main(String[] args) {
		/*
		 * try { // 예외가 발생할 프로그램 } 
		 * catch() { // 예외가 발생했을 때 실행될 프로그램 } 
		 * finally { 
		 * // 예외와 무관하게 무조건 실행 
		 * // try와 catch에 return문이 있어도 실행이 가능하다 
		 * } 
		 * // 이곳에 서도 예외와 무관하게 무조건실행한다 
		 * // 차이점 : try와 catch에 return문이 있으면 실행이 되지 않는다
		 */	
		try {
			int[] x = {4,8,12};
			System.out.println(x[0]);
			// System.out.println(x[6]);
			return;
		}
		catch(Exception e) {
			System.out.println("인덱스 범위를 넘어섰습니다.");
		}
		finally {
			System.out.println("프로그램 end");
		}
		System.out.println("try 바깥 end");
	}
}
