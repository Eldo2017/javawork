package _01_condition;

public class T01_if {

	public static void main(String[] args) {
		// if(조건식)
		/*
		 - 수행할 문장이 1개라면 중괗로 생략이 가능
		 if(조건식)
		   조건식이 참일 때 수행
		 
		 - 수행할 문장이 1개 이상이면 중괄호 꼭 필요함
		 if(조건식) {
		   수행할 문장;
		   수행할 문장;
		 }
		 */
		int x = 100;
		
		if(x == 100) System.out.println("100점");
		
		if(x > 80) {
			System.out.println("축하드립니다!");
			System.out.println("합격입니다");
		}

		System.out.println("불합격");
	}

}
