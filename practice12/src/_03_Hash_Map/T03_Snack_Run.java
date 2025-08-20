package _03_Hash_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T03_Snack_Run {

	public static void main(String[] args) {
		HashMap<String, Snack> sn = new HashMap<String, Snack>();
		
		sn.put("포카칩", new Snack("어니언맛",92));
		sn.put("뿌셔뿌셔", new Snack("지옥불맛",160));
		sn.put("초코팅촉", new Snack("초코맛",76));
		sn.put("눈을감자", new Snack("소금맛", 109));
		
		System.out.println(sn);
		
		System.out.println("---------------------------");
		
		// 1. put() : 키 값이 없다면 추가하고 있다면 값을 바꾸는데 사용한다
		sn.put("뿌셔뿌셔", new Snack("야키소바맛",88));
		
		System.out.println(sn);
		
		System.out.println("---------------------------");
		
		// 2. get(Object key) : 키에 해당하는 값을 반환한다
		Snack s = sn.get("포카칩");
		
		System.out.println(s);
		
		System.out.println("---------------------------");
		
		// 3. size() : 객체 개수를 반환한다
		System.out.println(sn.size());
		
		System.out.println("---------------------------");
		
		// 4. replace(K key, V value) : 해당 키를 찾아서 전달한 값으로 바꾼다
		// 키가 없을 경우라면 아무 기능도 하지 않는다
		sn.replace("뿌셔뿌셔", new Snack("카레맛", 113));
		
		System.out.println(sn);
		
		System.out.println("---------------------------");
		
		Set keySet = sn.keySet();
		
		Iterator itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = (String) itKey.next();
			Snack v = sn.get(key);
			
			System.out.println(key + "\t" + " : " + v);
		}
		
	}

}
