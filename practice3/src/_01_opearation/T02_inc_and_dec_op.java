package _01_opearation;

public class T02_inc_and_dec_op {

	public static void main(String[] args) {
		// ++ : 하나씩 증가한다
		int x1 = 10;
		x1++; // 11
		x1++; // 12
		
		int x2 = 34;
		x2--; // 33
		x2--; // 32
		
		// 단항인 경우, 연산자가 앞에 있든 뒤에 있든 결과는 같다
		int x3 = 17;
		++x3; //x3++;
		
		// 연산의 경우
		int x4 = 39;
		int x5 = 13;
		
		// 연산자가 앞에 있으면 먼저 증가시키고 
		// 뒤에 있으면 연산을 우선으로 한 후, 자기 자신값을 증가시킨다
		int res = ++x4 + x5++; // x4: 40, x5: 13 -> res = 40 + 13 = 53 -> x5: 14
		
		int x6 = x5 = 19;
		
		res = x5-- + ++x6; // x5: 19, x6: 20 -> res = 19 + 20 = 39 
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(res);
		System.out.println(x5);
		System.out.println(x6);
	}

}
