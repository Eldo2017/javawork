package _01_variable;

public class T04_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// escape sequence (이스케이프 문자)
		/*
		 \ + 문자 : 조합으로 특수 기능 수행
		 \n : 줄 바꿈
		 \t : 탭 만큼 띄우기
		 \" : 쌍따옴표 출력
		 \\ : 역슬래시(\) 출력
		 */

		/*
		 강의실 : "801호
		 강좌명 : "java 풀스택 웹&앱 개발자"
		 
		 강의실 : "801호 \ 강좌명 : "java 풀스택 웹&앱 개발자" 
		 */
		
		System.out.println("강의실 : \"801호\n강좌명 : \"java 풀스택 웹&앱 개발자\"");
		System.out.println("강의실 : \"801호 \\ 강좌명 : \"java 풀스택 웹&앱 개발자\"");
		
		System.out.println("최종보스 \"가면라이더\" 5번째 : \n가면라이더 엘드 ");
	}

}
