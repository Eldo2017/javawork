package _13_All_Practices;

class Exercise {
	private static Exercise ex = new Exercise();
	
	private Exercise(){
		System.out.println("객체를 생성합니다.");
	}
	
	static Exercise getInstance() {
		return ex;
	}
}

public class T01_Final_Ex01 {

	public static void main(String[] args) {
		String number = "123";
		
		System.out.println("출력값 : " + add(number));
		
		Exercise ex1 = Exercise.getInstance();
		Exercise ex2 = Exercise.getInstance();
		
		System.out.println("ex1 == ex2 : " + (ex1 == ex2));
	}
	
	public static String add(String number) {
		return number + "456";
	}

}
