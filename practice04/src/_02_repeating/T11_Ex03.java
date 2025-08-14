package _02_repeating;

public class T11_Ex03 {

	public static void main(String[] args) {
		// 3. 주사위 두 눈의 합이 6이 되는 경우의 수
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=6;b++) {
				if(a + b == 6) System.out.println("(" + a + ", " + b + ")");
			}
		}
		
		System.out.println("------------------------");
		
		// 4. 이중 for문으로 좌측이 직각인 직각삼각형 출력
		/*
		 
		*
		**
		***
		****
		*****
		
		*/
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		// 5. 이중 for문으로 좌측이 직각인 직각삼각형 반전 모습을 출력
		/*
		 
		*****
		****
		***
		**
		*
		
		*/
		
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		// 6. 이중 for문으로 피라미드 출력
		/*
		 
		 	*
		   ***
		  *****
		 *******
		*********
		
		*/
		
		for(int i=1;i<=5;i++) {
			// 공백 출력
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			// 별 출력
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		// 7. 주사위 눈이 6이 나올 때까지 반복해서 굴리고, 눈이 6이 되면 지금까지 
		// 굴린 횟수까지 출력 (while문 이용, Math.random()으로 난수 작성)
		
		int count = 0;
		
		while(true) {
			int dicenum = (int)(Math.random()*6)+1;
			System.out.println("주사위를 굴려라 : " + dicenum);
			count++;
			if(dicenum == 6) {
				System.out.println("총 주사위 굴린 횟수는 " + count + "회");
				break;
			}
		}
		
		
	}

}
