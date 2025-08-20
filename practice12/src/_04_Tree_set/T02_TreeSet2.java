package _04_Tree_set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class T02_TreeSet2 {
	public static void main(String[] args) {
		Integer[] arr = {1,4,6,2,8,9,4,3,2,9,7,6,1,5};
		
		Set<Integer> set = new TreeSet();
		for(Integer i : arr)
			set.add(i);
		
		System.out.println(set);
		
		/*
		 * NavigableSet
		 * 		Java의 인터페이스를 확장한 컬렉션 인터페이스
		 * 		정렬된 순서로 저장하고, 그 요소에 다양한 탐색 작업 지원
		 */
		
		NavigableSet<Integer> descending = ((TreeSet)set).descendingSet();
		System.out.println(descending);
		
		Integer[] score = {100, 67, 72, 84, 53, 91};
		TreeSet<Integer> setScore = new TreeSet<>();
		for(Integer i : score) setScore.add(i);
		
		System.out.println(setScore);
		
		System.out.println("84점 미만인 점수 검색 : " + setScore.headSet(84));
		System.out.println("84점 이상인 점수 검색 : " + setScore.tailSet(84,true));
		System.out.println("50점 이상이며 100점 미만 사이인 점수 검색 : " + setScore.subSet(50,100));
	}
}
