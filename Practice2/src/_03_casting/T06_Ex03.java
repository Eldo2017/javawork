package _03_casting;

public class T06_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K';
	    
	    // 3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력
	    double dNum2 = (double)iNum2 * dNum;
	    int ch2 = (int)ch + 1;
	    char ch3 = (char)ch2;
	    // 3.5  iNum1 / fNum 한 결과 3이 출력
	    int res = iNum1/(int)fNum;
	    
	    // 3.1  iNum1 / iNum2의 몫
	    System.out.println(iNum1 / iNum2);
	    // 3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력
	    System.out.println(dNum2);
	    // 3.3  iNum1의 값이 10.0으로 출력
	    System.out.printf("%.1f", (double)iNum1);
	    // 3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력
	    System.out.printf("\n%f\n", (double)iNum1 / iNum2);

	    // System.out.printf("\n%f\n", (double)(iNum1 / iNum2));
	    // -> 강제형변환을 이렇게 하는 순간 결과가 달라진다
	    
	    // 3.5  iNum1 / fNum 한 결과 3이 출력
	    System.out.println(res);
	    // 3.6  iNum1 / fNum 한 결과 소수점 13자리 이상까지 출력
	    System.out.printf("%.13f\n", (double)iNum1/fNum);
	    // 3.7  ch 변수의 유니코드 출력
	    System.out.println((int)ch);
	    // 3.8  ch변수에 1을 더해 L을 출력
	    System.out.println(ch3);
	}

}
