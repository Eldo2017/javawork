package _03_casting;

public class T02_casting {

	public static void main(String[] args) {
		// 강제 형 변환하는 방법을 학습한다
		System.out.println("byte 크기 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE); // Byte 뒤의 대문자는 값 변경이 불가한 상수이다
		System.out.println("short 크기 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int 크기 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("char 크기 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE); // Char형의 경우, 그대로 쓰는 경우 빈칸밖에 안보여서 int로 형변환 필수
		
		System.out.println("-------------------------------------------");
		// (자료형) 변수 : 변수를 자신이 원하고자 하는 자료형으로 바꾼다
		int i1 = 162579;
		byte b1 = (byte)i1;
		
		System.out.println(b1);
		
		long l1 = 3014829657L; // int형으로 간주 -> 뒤에 L을 붙여 구분한다
		float f1 = l1;
		System.out.println(f1);
		
		int i2 = 52384;
		char c1 = (char)i2; // char 표시흟 안하고 그냥 넣을 시 타입 불일치 오류 발생
		System.out.println(c1);
	}

}
