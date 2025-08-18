package _03_String_Buffer;

public class T03_math {

	public static void main(String[] args) {
		// 절대값 : abs()
		System.out.println("-17의 절대값 : " + Math.abs(-17));
		System.out.println("-21.63의 절대값 : " + Math.abs(-21.63));
		
		System.out.println("-----------------------------------------");
		
		// 소수점 이하를 큰 숫자로 올려라 : ceil()
		System.out.println("39.5의 올림 : " + Math.ceil(39.5));
		System.out.println("-39.5의 올림 : " + Math.ceil(-39.5));
		
		// 소수점 이하를 작은 숫자로 내려라 : floor()
		System.out.println("28.6의 내림 : " + Math.floor(28.6));
		System.out.println("-28.6의 내림 : " + Math.floor(-28.6));
		
		System.out.println("-----------------------------------------");
		
		// 가장 가까운 정수를 바꿔라 : rint()
		System.out.println("50.2에 가까운 정수 : " + Math.rint(50.2));
		System.out.println("31.8에 가까운 정수 : " + Math.rint(31.8));
		System.out.println("73.5에 가까운 정수 : " + Math.rint(73.5)); // 74
		System.out.println("-50.2에 가까운 정수 : " + Math.rint(-50.2));
		System.out.println("-31.8에 가까운 정수 : " + Math.rint(-31.8));
		System.out.println("-73.5에 가까운 정수 : " + Math.rint(-73.5)); // -74
		
		System.out.println("-----------------------------------------");
		
		// 소수점 이하를 반올림하라(가장 가까운 정수로) : round()
		// int res = (int)Math.round(71.6); // round() 반환형은 long
		System.out.println("50.2의 반올림값 : " + Math.round(50.2));
		System.out.println("31.8의 반올림값 : " + Math.round(31.8));
		System.out.println("73.5의 반올림값 : " + Math.round(73.5)); // 74
		System.out.println("-50.2의 반올림값 : " + Math.round(-50.2));
		System.out.println("-31.8의 반올림값 : " + Math.round(-31.8)); // -32
		System.out.println("-73.5의 반올림값 : " + Math.round(-73.5)); // -74
	
		System.out.println("-----------------------------------------");
		
		// 소수점 둘째 자리까지 반올림하라
		double val = 19.31256;
		
		double res1 = val*100; // 1931.256
		double res2 = Math.round(res1); // 1931
		double res3 = res2/100; // 19.31
		
		System.out.println(res3);
		System.out.printf("%.2f\n",res3);
		
		System.out.println("-----------------------------------------");
		
		// 두 수 중 큰 수 or 작은 수를 반환하라 : max/min
		System.out.println("9와 16중 큰 숫자 : " + Math.max(9, 16));
		System.out.println("9와 16중 작은 숫자 : " + Math.min(9, 16));
		
		System.out.println("1.05와 13.08중 큰 숫자 : " + Math.max(1.05, 13.08));
		System.out.println("1.05와 13.08중 작은 숫자 : " + Math.min(1.05, 13.08));
		
		int ch1 = Math.max('k', 'x');
		int ch2 = Math.min('k', 'x');
		
		System.out.println("k와 x중 큰 것 : " + (char)ch1);
		System.out.println("k와 x중 작은 것 : " + (char)ch2);
		
		System.out.println("-----------------------------------------");
		
		// 제곱연산 : pow()
		System.out.println("7^3 : " + (int)Math.pow(7,3));
		System.out.println("1024^2 : " + (int)Math.pow(1024,2));
		
		System.out.println("-----------------------------------------");
		
		// 제곱근 : sqrt()
		System.out.println("81의 제곱근 : " + (int)Math.sqrt(81));
		System.out.println("-----------------------------------------");
		
		// 랜덤값을 추출하라 : random()
		// 1~100까지의 값 중 하나 추출
		int rand = (int)(Math.random()*100)+1;
		System.out.println(rand);
		System.out.println("-----------------------------------------");
	}
}
