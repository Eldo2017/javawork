package _02_interface;

public class InterMain {

	public static void main(String[] args) {
		// Inter i = new Inter(); -> 오류
		Inter i = new InterClass();
		i.print(7);
		i.method();
		i.str("김두한");
		
		System.out.println(i.PI);
		
		// i.MAX = 50; -> 상수이기 때문에 나중에 변경이 불허하다
		System.out.println("최대값 : " + i.MAX);
		
	}

}
