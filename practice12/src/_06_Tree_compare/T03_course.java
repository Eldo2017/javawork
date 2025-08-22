package _06_Tree_compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class Courses implements Comparable<Courses>{
	String course_name;
	int price;
	
	Courses(String course_name, int price){
		this.course_name=course_name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "강좌명 : " + course_name + "금액 : " + price;
	}
	
	@Override
	public int compareTo(Courses other) {
		int byPrice = Integer.compare(this.price, other.price);
		if(byPrice != 0) return byPrice;
		return this.course_name.compareTo(other.course_name);
	}
	
	public String getCourseName() {return course_name;}
	public int getPrice() {return price;}
}

class PriceDescComparator implements Comparator<Courses> {

	@Override
	public int compare(Courses x, Courses y) {
		int byPrice = Integer.compare(y.getPrice(), x.getPrice());
	
		if(byPrice!=0) return byPrice;
		return x.getCourseName().compareTo(y.getCourseName());
	}
	
}
public class T03_course {

	public static void main(String[] args) {
		// 오름차순(기본 compareTo) TreeSet
		TreeSet<Courses> t1 = new TreeSet<>();
		
		t1.add(new Courses("모바일 프로그래밍",35000));
		t1.add(new Courses("객체지향 프로그래밍",20000));
		t1.add(new Courses("임베디드 프로그래밍",43000));
		t1.add(new Courses("게임 프로그래밍",57000));

		System.out.println("=== 오름차순(금액) ===");
		
		for(Courses c : t1) System.out.println(c);
		
		// 내림차순(Comparator) TreeSet
		TreeSet<Courses> t2 = new TreeSet<>(new PriceDescComparator());
		t2.addAll(t1);
		
		System.out.println("=== 내림차순 금액 ===");
		
		for(Courses c : t2) System.out.println(c);
	}

}
