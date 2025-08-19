package _01_ArrayList_Vector;

import java.util.ArrayList;
import java.util.List;

/*
 * List 계열
 * - 특징 : 순서가 있고 중복 저장이 가능하다
 * 1) ArrayList : 싱글 스레드에서 사용한다
 *   > 초기 배열 10개를 만든다 => 10개가 부족하면 그의 배수로 더 만든다
 *   > 배열 개수를 지정할 수 있다 : new ArrayList<>(배열 개수)
 *   > 부모 자료형으로 형변환하여 많이 사용한다
 *     List<자료형> 변수명 = new ArrayList<자료형>();
 * 2) Vector : ArrayList와 사용 방법이 동일한데, 멀티 스레드에서 사용한다.
 * 3) Linked List
 * 
 * 제네릭
 * - 자료형을 제네릭으로 받는다
 * ArrayList<T> -> 모든 자료형을 받을 수가 있다
 * 				   클래스 객체가 들어올 때 사용자가 임의로 이름을 짓기 때문에 이름을 알 수가 없다
 */

public class T01_ArrayList1 {

	public static void main(String[] args) {
		// ArrayList<String> alist = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		list.add("Build");
		list.add("Cross-Z");
		list.add("Rogue");
		list.add(2,"Grease");
		list.add("Evol");
		
		System.out.println("총 객체 수 : " + list.size());
		System.out.println(list);
		
		// 얻어올 때 : get(index)
		System.out.println("index 3번에 있는 것 : " + list.get(3));
		// System.out.println(list[2]); -> 배열에서나 이용하는 것. 객체에서 쓰는 경우는 메소드를 써야 함
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
			// System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------");
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("-----------------------------------------");
		
		/*
		 * 삭제
		 * Object remove(index)
		 * booolean remove(객체)
		 * void clear() : 전부 삭제
		 */
		
		System.out.println("삭제한 객체 : " + list.remove(4));
		System.out.println("남은 개수 : " + list.size());
		System.out.println("-----------------------------------------");
		
		list.remove("Grease");
		
		System.out.println("삭제 후 : ");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		list.clear();
		System.out.println("남은 개수 : " + list.size());
	}
}
