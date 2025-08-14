package _02_method;

public class T01_main_Method {

	public static void main(String[] args) {
		T01_api_Method ob1 = new T01_api_Method();
		
		ob1.print1();
		// 주의 : 반환형이 없는 메소드(void 형식)는 값을 저장할 수 없다
		//       그리고 출력문도 사용할 수가 없다
		
		/*
		 * int x = ob1.print1(); 
		 * System.out.println(ob1.print1());
		 */
		
		System.out.println();
		
		int a = ob1.print2(); // int a = 10;
		System.out.println(a);

		System.out.println();
		
		System.out.println(ob1.print3());
		
		System.out.println();
		
		ob1.print4(17);
		
		System.out.println();
		
		int b = ob1.print5(4, 4);
		System.out.println(b);
		
		System.out.println();
		
		System.out.println(ob1.print5(5, 8));
		
		System.out.println();
		
		String name = ob1.print6(19, "김두한", "서울시 종로구");
		System.out.println(name);
		
		System.out.println();
		
		T02_api_Method_calc ob2 = new T02_api_Method_calc();
		
		int res1 = ob2.adding(3, 7);
		System.out.println(res1);
		
		System.out.println();
		
		int res2 = ob2.subtracting(10, 6);
		System.out.println(res2);
		
		System.out.println();
		
		int res3 = ob2.multiplying(8, 8);
		System.out.println(res3);
		
		System.out.println();
		
		double res4 = ob2.dividing(7, 2);
		System.out.println(res4);
		
		System.out.println();
		
		int res5 = ob2.modding(18, 5);
		System.out.println(res5);
	}
}
