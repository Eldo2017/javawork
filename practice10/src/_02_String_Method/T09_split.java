package _02_String_Method;

import java.util.Arrays;

public class T09_split {

	public static void main(String[] args) {
		// split : 문자열을 기준 문자열로 분리해 배열로 만든다
		String str  = "스토리우스-쥬우가-리가드_오메가-엘드";
		String[] name = str.split("-");
		
		System.out.println(name.length);
		System.out.println(Arrays.toString(name));
		
		str  = "아크제로@스토리우스-쥬우가/리가드 오메가,엘드";
		String[] name2 = str.split("@|-|/|,");
		
		System.out.println(name2.length);
		System.out.println(Arrays.toString(name2));
		
		// split(분리문자열, 배열 개수)
		str  = "루시퍼-팔시온-다이몬-크로스 기츠-도라도-카리에스";
		name = str.split("-",3);
		System.out.println(Arrays.toString(name));
		System.out.println(name[0]);
	}
}
