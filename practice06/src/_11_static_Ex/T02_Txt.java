package _11_static_Ex;

public class T02_Txt {
	String title;
	static int count = 0;

	// 기본 생성자 - 제목 없음 자동 생성
	public T02_Txt() {
		count++;
		title = "제목 없음" + count;
		System.out.println("생성한 파일명 : " + title + ".txt");
	}

	// 사용자 정의 제목을 받는 생성자
	public T02_Txt(String title) {
		count++;
		this.title = title;
		System.out.println("생성한 파일명 : " + this.title + ".txt");
	}

	public static int getCount() {
		return count;
	}
}

// T02_Txt.java