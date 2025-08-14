package _11_static_Ex;

public class T02_Txt_main {

	public static void main(String[] args) {
		T02_Txt p1 = new T02_Txt();             // 제목 없음1.txt
		T02_Txt p2 = new T02_Txt("java");       // java.txt
		T02_Txt p3 = new T02_Txt("hello");      // hello.txt

		System.out.println("생성된 파일의 갯수 : " + T02_Txt.getCount());

		T02_Txt p4 = new T02_Txt();             // 제목 없음4.txt
		T02_Txt p5 = new T02_Txt("C언어");      // C언어.txt

		System.out.println("생성된 파일의 갯수 : " + T02_Txt.getCount());
	}

}

// T02_Txt_main.java