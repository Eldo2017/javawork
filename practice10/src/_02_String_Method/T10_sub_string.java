package _02_String_Method;
/*
 * substring : 문자열에서 원하는 문자열만 추출할 때 쓴다
 * - substring(index) : 문자열에서 인덱스 번호부터 끝까지 얻어온다
 * - substring(index,lastindex) : 문자열에서 인덱스 번호부터 끝 인덱스 번호 앞까지 얻어온다.
 */
public class T10_sub_string {

	public static void main(String[] args) {
		String str = "Demons Vail Glare Regad Dread Eldo";
		String answer = str.substring(7);
		System.out.println(answer);
		
		answer = str.substring(24, 29);
		System.out.println(answer);
		String sn = "060320-4169520";
		answer = sn.substring(0,6);
		System.out.println(answer);
		System.out.println("20"+sn.substring(0,2)+"년 "+sn.substring(2, 4)+"월 "+sn.substring(4, 6)+"일");
		int age = 2025-(2000+Integer.parseInt(sn.substring(0,2)));
		System.out.println(age+"살");
		
		int year = Integer.parseInt(sn.substring(0,2));
		if(year <= 25) year += 2000;
		else year += 1900;
		
		System.out.println("나이 : " + (2025-year) + "세");
	}

}
