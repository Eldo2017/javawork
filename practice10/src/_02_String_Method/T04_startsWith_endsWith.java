package _02_String_Method;

public class T04_startsWith_endsWith {

	public static void main(String[] args) {
		// startsWith : 맨 앞에 지정하는 문자로 시작하는지 검사한다
		String str = "Kamen rider Dread";
		boolean answer = str.startsWith("Ka");
		System.out.println(answer);
		
		// endsWith : 맨 끝에 지정하는 문자로 끝나는지
		String[] strArr = {"Horobi.jpg","Storious.class","Juuga.txt","regadOmega.jpeg","Eldo.png"};
		
		for(int i = 0;i<strArr.length;i++) {
			if(strArr[i].endsWith("jpg") || strArr[i].endsWith("png")) {
				System.out.println(strArr[i] + "는 그림 파일");
			}
		}
	}
}
