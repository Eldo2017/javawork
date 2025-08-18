package _01_LangPackage;

import java.util.Objects;

class Person extends Object{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		
		if(!(o instanceof Person)) return false;
		Person p = (Person) o;
		
		return Objects.equals(name, p.name) && age == p.age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
public class T04_Exercise1 {

	public static void main(String[] args) {
		Person p1 = new Person("김두한",29);
		Person p2 = new Person("김무옥",33);
		Person p3 = new Person("문영철",31);
		Person p4 = new Person("김두한",29);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
