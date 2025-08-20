package _03_Hash_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
  	- 키와 값의 쌍으로 이루어져 있다.
  	- 값을 얻어올때 키값으로 얻어온다. 그러므로 키는 중복 불가. 값은 중복 허용
  	- Map계열은 Collection을 구현한 클래스가 아님
  	  : 넣을 때는 put() 사용
 	1. HashMap
 	2. TreeMap
 */

public class T01_HashMap1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 넣기
		map.put("장래오", 26);
		map.put("반용주", 23);
		map.put("한수호", 29);
		map.put("정무열", 35);

		// Entry 개수
				System.out.println("총 Entry 수 : " + map.size());
				
				// 객체 찾기
				System.out.println("장래오 : " + map.get("반용주"));
				System.out.println(map);
				
				// 객체 삭제
				map.remove("한수호");
				System.out.println("총 Entry 수 : " + map.size());
				
				// 키만 얻어오기
				Set<String> keySet = map.keySet();  
				System.out.println(keySet);
				
				Iterator<String> keyIterator = keySet.iterator();
				while(keyIterator.hasNext()) {
					String key = keyIterator.next();
					Integer value = map.get(key);
					System.out.println(key + ":" + value);
				}
				System.out.println("--------------------------------------");
				
				// 키와 값이 들어있는 entrySet
				Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
				Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
				while(entryIterator.hasNext()) {
					Map.Entry<String, Integer> entry = entryIterator.next();
					String key =entry.getKey();		// 키 가져오기
					Integer value = entry.getValue();  // 값 가져오기
					System.out.println(key + ":" + value);
				}
	}

}
