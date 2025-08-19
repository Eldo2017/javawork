package _01_ArrayList_Vector;

import java.util.ArrayList;
import java.util.List;

public class T04_Board_run {

	public static void main(String[] args) {
		List<Board> l = new ArrayList<>();
		
		Board b1 = new Board("This is sparta","This! Is! Sparta!","Eldo");
		l.add(b1);
		l.add(new Board("Car Accident","Crash with car!","Caries"));
		l.add(new Board("Electric Shock","Shock with Thunder!","Regad_Omega"));
		l.add(new Board("Skull","Fall into Darkness!","Dread"));
		l.add(new Board("Devil","I am Demon of you!","Demons"));
		
		System.out.println("총 객체 수 : " + l.size());
		
		Board b2 = l.get(1);
		
		System.out.println("인덱스 1번에 든 제목: " + b2.getTitle());
		System.out.println("인덱스 1번에 든 작성자: " + b2.getWriter());
		System.out.println("인덱스 1번에 든 내용: " + b2.getContent());
		
		System.out.println("--------------------------------");
		
		// 모든 객체를 하나씩 가져와 출력하라
		
		for(int i=0;i<l.size();i++) {
			Board b3 = l.get(i);
			System.out.println("제목: " + b3.getTitle());
			System.out.println("작성자: " + b3.getWriter());
			System.out.println("내용: " + b3.getContent());
			System.out.println("--------------------------------");
		}
		
		for(Board b : l) {
			System.out.println(b.getTitle() + "\t" + b.getContent() + "\t" + b.getWriter() + "\t");
		}
		System.out.println("--------------------------------");
		l.remove(1);
		l.remove(1);
		for(Board b : l) {
			System.out.println(b.getTitle() + "\t" + b.getContent() + "\t" + b.getWriter() + "\t");
		}
	}

}
