package _02_Array;

public class T09_Array_for {

	public static void main(String[] args) {
		// 배열에서만 사용할 수 있는 반복문
		// 전체 배열만 가능하다

		int xArr[] = {14, 28, 42, 56, 70};
		
		// for(int i=0;i<xArr.length;i++) => 사용 가능
		for(int res1: xArr) {
			System.out.println(res1);
		}
		
		System.out.println("---------------------------------");
		String name[]= {"김두한","김무옥","문영철","김영태"};
		
		for(String res2 : name) {
			System.out.println(res2);
		}
		
		System.out.println("---------------------------------");
		String name2[]= new String[4];
		
		int idx = 0;
		
		for(String res3 : name) {
			name2[idx] = res3;
			idx++; // or name2[idx++]
			System.out.println(name2[idx-1]);
		}
	}

}
