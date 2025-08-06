package _02_repeating;

public class T11_Ex03 {

	public static void main(String[] args) {
		// 3. 주사위 두 눈의 합이 6이 되는 경우의 수
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=6;b++) {
				if(a + b == 6) System.out.println("(" + a + ", " + b + ")");
			}
		}

	}

}
