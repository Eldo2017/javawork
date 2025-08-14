package _02_Array;

public class T03_Ex01 {

	public static void main(String[] args) {
		// 1. 총점, 평균 구하기
		int score[] = {53, 92, 83, 61, 77};
		int i;
		int sum = 0;
		for(i=0;i<score.length;i++) {
			sum+=score[i];
			System.out.println("각 값들의 합: " + sum);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("배열 값들의 합 : " + sum);
		
		int avg = sum / score.length;
		
		System.out.println("그 값들의 평균 : " + avg);
		
		System.out.println("---------------------------");
		
		// 2. 최대값, 최소값 구하기
		int x[] = {11, 32, 88, 64, 40, 94, 73, 107, 15};
		
		int j;
		
		int max = x[0];
		int min = x[0];
		
		for(j=0;j<x.length;j++) {
			if(x[j]>max) {
				max=x[j];
			}
			if(x[j]<min){
				min=x[j];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("---------------------------");
		
		//3. 정수형 배열 10개를 만들어 랜덤함수로 값 넣기
		int y[]= new int[10];
		
		int k;
		
		for(k=0;k<y.length;k++) {
			y[k]=(int)(Math.random()*100)+1;
			System.out.print(y[k] + " ");
		}
		System.out.println();
		
		// 인덱스 번호도 연산된다
		
		System.out.println("---------------------------");
	}
}
