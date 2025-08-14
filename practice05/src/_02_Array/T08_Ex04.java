package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T08_Ex04 {

	public static void main(String[] args) {
		/*
		 * 9. 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 
		 * “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를
		 * 출력하세요. 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요. 
		 * ex. 치킨 이름을 입력하세요 : 양념 
		 * 양념치킨 배달 가능
		 * 
		 * 치킨 이름을 입력하세요 : 불닭 
		 * 불닭치킨은 없는 메뉴입니다.
		 */

		
		  Scanner input = new Scanner(System.in);
		  
		  String chickens[] = {"후라이드","양념","허니뿌링클","어니언","불닭","갈릭버터","지옥불"};
		  
		  int i,j;
		  
		  for(i=0;i<chickens.length; i++) { 
		      System.out.println("치킨 종류 : " + chickens[i]); 
		   }
		  
		   System.out.print("치킨명을 입력 : "); 
		   String input2 = input.next();
		   
		   boolean found = false;
		   
		   for(i=0;i<chickens.length;i++) {
			   if(chickens[i].equals(input2)) {
				   found = true;
				   break;
			   }
		   }
		  
		   if(found) { 
		     System.out.println(input2 + " 치킨은 배달 가능합니다."); 
		   }
		   else { 
		     System.out.println(input2 + " 치킨은 배달 불가능합니다."); 
		   }
		 
		
		/*
		 * 10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그
		 * 값 중에서 최대값과 최소값을 출력하세요.
		 * 
		 * ex. 5 3 2 7 4 8 6 10 9 10 
		 * 최대값 : 10 최소값 : 2
		 */
		
		int x[]=new int[10];
		
		for(i=0;i<x.length;i++) {
			x[i]=(int)(Math.random()*10)+1;
		}
		
		int max=x[0];
		int min=x[0];
		
		for(i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
			
			if(max < x[i]) {
				max = x[i];
			}
			if(min > x[i]) {
				min = x[i];
			}
		}
		
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		/*
		 * 11. 사용자로부터 정수값 5개 배열에 입력 오름차순 정렬로 정렬하기 (버블 정렬)
		 */
		int y[]= {7,14,54,83,38,105,16};
		int count=0;
		for(i=0;i<y.length-1;i++) {
			boolean flag = false;
			for(j=0;j<y.length-i-1;j++) {
				if(y[j]>y[j+1]) {
					int tmp = y[j];
					y[j]=y[j+1];
					y[j+1]=tmp;
					flag = true;
				}
			}
			if(!flag) break;
			count++;
		}
		System.out.println(Arrays.toString(y));
		System.out.println("총 회전수 : " + count);
		
		/*
		 12. 각 학생별 국어 영어 수학점수의 총점과 평균을 구하고
   		 각 과목별 총점과 평균을 구해 아래와 같이 출력하기
   		 점수는 2차원 배열로 마음대로 넣는다.

  		번호  국어    영어    수학    총점  평균
	   -----------------------------------------
   		1     95    100     78   273  83.3
   		2     68     57    100   273  83.3
   		3     62     97     85   273  83.3
   		4     85     83     69   273  83.3
   		5     86     74     38   273  83.3
	   ------------------------------------------
		총점   479   500   387 
		평균  95.0  100.0  78.3
		 */
		
		int[][] scores = {
	            {55, 90, 83},
	            {70, 86, 93},
	            {88, 95, 72},
	            {100, 60, 55}
	        };

	        String[] names = {"김두한", "김무옥", "문영철", "정진영"};

	        int studentCnt = scores.length;
	        int subjectCnt = scores[0].length;

	        int[] subjectSum = new int[subjectCnt];

	        System.out.println("번호   이름     국어  영어  수학  총점  평균");
	        System.out.println("--------------------------------------------------");

	        for (i = 0; i < studentCnt; i++) {
	            int total = 0;
	            System.out.printf("%3d  %-6s", i + 1, names[i]); // 번호와 이름 출력

	            for (j = 0; j < subjectCnt; j++) {
	                int score = scores[i][j];
	                System.out.printf("%6d", score);
	                total += score;
	                subjectSum[j] += score;
	            }

	            double avg = (double) total / subjectCnt;
	            System.out.printf("%6d%7.1f\n", total, avg);
	        }

	        System.out.println("--------------------------------------------------");

	        System.out.print("총점         ");
	        for (int total : subjectSum) {
	            System.out.printf("%6d", total);
	        }
	        System.out.println();

	        System.out.print("평균         ");
	        for (int total : subjectSum) {
	            double avg = (double) total / studentCnt;
	            System.out.printf("%6.1f", avg);
	        }
	}
}
