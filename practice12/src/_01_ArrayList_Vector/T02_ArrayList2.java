package _01_ArrayList_Vector;

import java.util.ArrayList;
import java.util.List;

public class T02_ArrayList2 {

	public static void main(String[] args) {
		// 권장 방법은 아니다
		// 모든 객체를 받을 수 있다
		List list = new ArrayList();
		list.add(10);
		list.add(10.65);
		list.add("1972");
		
		Object x1 = list.get(0);
		int x2 = (int)list.get(0);
		System.out.println(x2+1);
		
		System.out.println("-----------------------------");
		
		Object y1 = list.get(1);
		double y2 = (double)list.get(1);
		System.out.println(y2 + 1);
		
		System.out.println("-----------------------------");
		
		Object z1 = list.get(2);
		int z2 = Integer.parseInt((String)list.get(2));
		System.out.println(z2);
		
		System.out.println("-----------------------------");
		
		System.out.println("총 합계 : " + (x2 + y2 + z2));
	}

}
