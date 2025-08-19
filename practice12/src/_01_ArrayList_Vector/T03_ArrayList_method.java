package _01_ArrayList_Vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T03_ArrayList_method {

	public static void main(String[] args) {
		/*
		 * List<Integer> list = new ArrayList<>(Arrays.asList(1,4,7,10)); 
		 * List<Integer> list = List.of(1,4,7,10);
		 */
		
		// for문으로 넣기
		List<Integer> list1 = new ArrayList<>();
		
		for(int i=100;i>=1;i--) {
			list1.add(i);
		}
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>(list1.subList(1,6)); // 인덱스를 1부터 6까지
		System.out.println(list2);
		
		Collections.sort(list1); // sort()는 반환형이 없다(void)
		System.out.println("오름차순 정렬 " + list1);
		
		Collections.reverse(list1); // reverse()는 반환형이 없다(void)
		System.out.println("내림차순 정렬 " + list1);
		
		System.out.println("list1은 list2의 요소를 모두 갖고 있나? " + list1.containsAll(list2));
		
		List<String> slist = new ArrayList<>();
		
		slist.add("Build");
		slist.add("Cross-Z");
		// slist.add(3,"Grease"); 
		// System.out.println(slist); //오류
		
		slist.add(2,"Grease");
		System.out.println(slist);
		
		List<String> slist2 = new ArrayList<>();
		slist2.add("Build");
		slist2.add("Cross-Z");
		slist2.add("Gotchard");
		slist2.add("Legend");
		
		//겹치는 것만 남기고 나머지를 삭제하라
		System.out.println("slist에서 slist2와 겹치는 부분만 남기고 삭제했는가? : " + slist.retainAll(slist2));
		System.out.println("slist : " + slist);
		System.out.println("slist2 : " + slist2);
		
		
	}
}
