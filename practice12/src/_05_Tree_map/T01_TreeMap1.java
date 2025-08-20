package _05_Tree_map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class T01_TreeMap1 {

	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		
		treeMap.put("고경주", 31);
		treeMap.put("신영균", 36);
		treeMap.put("개코", 33);
		treeMap.put("문영철", 37);
		treeMap.put("김무옥", 38);
		treeMap.put("김두한", 39);
		treeMap.put("김영태", 45);
		
		System.out.println("[김씨와 신씨 사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("김", true, "신", true);
		for(Map.Entry<String,Integer> entry : rangeMap.entrySet()) 
			System.out.println(entry.getKey() + " - " + entry.getValue() + "살");
	}

}
