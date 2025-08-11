package _13_All_Practices;

class Math {
	// 최대값 반환 메서드
	public int max(int[] arr) {
		int max = arr[0]; // 맨 첫번째 값을 최대값으로 설정
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}
	
	//최소값 반환 메서드
	public int min(int[] arr) {
		int min = arr[0]; // 맨 첫번째 값을 최대값으로 설정
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < min) min = arr[i];
		}
		return min;
	}
}

public class T02_Final_Ex02 {

	public static void main(String[] args) {
		int[] arr = {9,5,24,13,3,21};
		
		Math m = new Math();
		int max = m.max(arr);
		int min = m.min(arr);

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
