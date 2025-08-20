package _02_Hash_Set;

import java.util.HashSet;
import java.util.Set;

class Member {
	String name;
	int age;
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			// Member member = (Member)obj;
			// return name.equals(member.name) && age == member.age;	
			return name.equals(((Member)obj).name) && age == ((Member)obj).age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public String toString() {
		return name + "/" + age;
	}
}

public class T03_HashSet3 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("심영",28));
		set.add(new Member("정진영",26));
		set.add(new Member("신불출",37));
		set.add(new Member("심영",28));
		set.add(new Member("정진영",26));
		set.add(new Member("신불출",37));
		
		System.out.println("총 객체 수 : " + set.size());
		System.out.println(set);
	}

}
