package _01_ArrayList_Vector;

import java.util.List;
import java.util.Vector;

public class T05_Board_vector_run {

	public static void main(String[] args) {
		List<Board> l = new Vector<>();
		
		l.add(new Board("연애혁명","실험용1","신불출"));
		l.add(new Board("님","실험용2","심영"));
		l.add(new Board("혁신의 시작","실험용3","정진영"));
		
		l.remove(2);
		
		for(Board b : l) {
			System.out.println(b.getTitle() + "\t" + b.getContent() + "\t" + b.getWriter() + "\t");
		}
	}

}
