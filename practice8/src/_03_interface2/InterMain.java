package _03_interface2;

public class InterMain {

	public static void main(String[] args) {
		// Inter i = new Inter(); -> 오류
		InterClass i = new InterClass();
		i.print(7);
		i.method();
		i.str("김두한");
		
		System.out.println(i.PI);
		System.out.println(Inter1.PI);
		
		// i.MAX = 50; -> 상수이기 때문에 나중에 변경이 불허하다
		System.out.println("최대값 : " + i.MAX);
		
		System.out.println(i.add(7,10));
		
	}

}
