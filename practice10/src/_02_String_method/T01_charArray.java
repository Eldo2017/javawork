package _02_String_method;


public class T01_charArray {

	public static void main(String[] args) {
		String str1 = new String("나 김두한이다");	
		String str2 = "사딸라!";

		char[] chArr = {'김','두','한'};
		String str3 = new String(chArr);
		System.out.println(str3);
		
		char ch = str3.charAt(1);
		System.out.println(ch);
		
		// 주민번호 넣을 변수 하나 지정하고
		// 여기서 8번째가 1,3이면 남자, 2,4이면 여자
		String resi = new String("150315-3254208");
		
		System.out.println("주민번호 : " + resi);
		
		char gen_num = resi.charAt(7);
		if(gen_num == '1' || gen_num == '3') System.out.println("당신의 성별은 남성이다.");
		else System.out.println("당신의 성별은 여성이다.");
	}

}
