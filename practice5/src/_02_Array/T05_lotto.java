package _02_Array;

public class T05_lotto {

	public static void main(String[] args) {
		// Lotto : 1부터 45까지의 숫자 중 6개의 숫자 추출
		int lotto[] = new int[45];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		};
		for(int i=0;i<6;i++) {
			int idx = (int)(Math.random()*45);
			
			int temp = lotto[i];
			lotto[i] = lotto[idx];
			lotto[idx] = temp;
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------");
	}

}
