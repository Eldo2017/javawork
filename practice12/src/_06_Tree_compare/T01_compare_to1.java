package _06_Tree_compare;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;

	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}

	@Override
	public int compareTo(Person o) {
		if(age < o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
}

public class T01_compare_to1 {

	public static void main(String[] args) {
		TreeSet<Person> p1 = new TreeSet<>();
		
		p1.add(new Person("서인화",35));
		p1.add(new Person("신태랑",22));
		p1.add(new Person("전광현",45));
		
		System.out.println(p1);

	}

}
