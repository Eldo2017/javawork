package _02_Array;

public class T04_Dim2Array {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] score = {
				{1, 2, 3, 4, 5},  // [0]
				{6, 7, 8, 9, 10}, // [1]
				{11,12,13,14,15}, // [2]
				{16,17,18,19,20}, // [3]
				{21,22,23,24,25}, // [4]
				{26,27,28,29,30}  // [5]
			//  [0][1][2][3][4]
		};
		System.out.println(score[2][3]); // 14
		System.out.println(score[3][2]); // 18
		
		System.out.println("score 길이(행) : " + score.length);
		System.out.println("score[4]의 길이(열) : " + score[4].length);
		
		System.out.println("------------------------------------");
		
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		// 4 * 3 배열에 3의 배수값을 넣는다
		int[][] nArr = new int[4][3];
		int cnt = 3;
		for(int i=0;i<nArr.length;i++) {
			for(int j=0;j<nArr[i].length;j++) {
				nArr[i][j]=cnt;
				cnt+=3;
				System.out.print(nArr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		int[][] mArr= {
				{13,26,39},
				{14,28},
				{15,30,45,60}};
		
		for(int i=0;i<mArr.length;i++) {
			for(int j=0;j<mArr[i].length;j++) {
				System.out.print(mArr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
	}

}
