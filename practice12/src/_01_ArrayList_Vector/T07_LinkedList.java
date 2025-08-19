package _01_ArrayList_Vector;

import java.util.LinkedList;
import java.util.List;

/*
 * Linked List
 * - 배열의 단점을 보완해 나온 것이다
 * - 연속적으로 붙어있지 않는 대신, 다음 데이터를 연결하는 참조 주소가 있다
 */

public class T07_LinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(17);
		list.add(0,61);
		list.addFirst(11);
		list.addLast(34);
		list.add(83);
		
		System.out.println(list);
		
		// 검색 시 비효율적
		for(int i=0;i<list.size();i++) {
			list.get(i);
		}
		System.out.println(list);
	}

}
