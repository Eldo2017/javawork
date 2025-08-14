package _02_repeating;

public class T06_continue {

	public static void main(String[] args) {
		// 1~100까지의 숫자 중 3의 배수를 제외한 합계를 구하라
		// 1 + 2 + 4 + 5 + ...
		int sum = 0;
		int i;
		for(i=1;i<=100;i++) {
			if(i%3==0) continue;
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
	}

}
