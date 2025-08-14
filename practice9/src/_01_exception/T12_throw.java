package _01_exception;

public class T12_throw {

	public static void main(String[] args) {
		// throw: 강제로 예외를 발생시킬 때
		// throws: 메소드를 호출해 사용할 때, 발생할 수 있는 예외를 명시한 후
		//		   이 메소드를 사용하는 데에서 명시한 예외에 대한 대비를 해라
		try {
			Exception e = new Exception("강제로 예외 발생을 시켰다.");
			throw e;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
	}
}
