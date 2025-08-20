package _04_Tree_set;

import java.util.Set;
import java.util.TreeSet;

public class T01_TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<>();
		
		score.add(71);
		score.add(95);
		score.add(83);
		score.add(54);
		score.add(62);
		
		System.out.println(score);
		System.out.println("가장 낮은 점수는 " + score.first());
		System.out.println("가장 높은 점수는 " + score.last());
		System.out.println("95점보다 아래 점수는 " + score.lower(95));
		System.out.println("71점보다 위의 점수는 " + score.higher(71));
		System.out.println("95점이거나 바로 아래 점수는 : " + score.floor(95));
		System.out.println("95점이거나 바로 위의 점수는 : " + score.ceiling(95));
		
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto);
	}
}
