package _01_opearation;

public class T05_three_comp {

	public static void main(String[] args) {
		// 삼항 연산자 : 항이 세 개 -> (조건식) ? 참인 경우의 값 : 거짓인 경우의 값
		int x = 17;
		int y = 6;
		int z = -9;
		
		String answer1 = x < y ? "x가 더 작다" : "x가 더 크다";
		char answer2 = x < y ? '소' : '대';
		int answer3 = z < 0 ? -z : z;
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
	}
}
