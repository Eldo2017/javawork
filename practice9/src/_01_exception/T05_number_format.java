package _01_exception;

public class T05_number_format {

	public static void main(String[] args) {
		String[] str = {"102", "104", "107", "1.0012"};
		int i = 0;
		
		try {
			for(i=0; i<str.length; i++) {
				int x = Integer.parseInt(str[i]);
				System.out.println(x);
			}
		}
		catch (NumberFormatException e) {
			System.out.println("정수로 변환이 되지 않는 것이 있습니다.");
			System.out.println(str[i] +"는 " + "정수로 변환할 수 없습니다.");
			System.out.println(e);
		}
	}

}
