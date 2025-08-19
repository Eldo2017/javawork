package _01_Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T03_simple_data_format {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);

		/*
		 * SimpleDateFormat 클래스 : 날짜 관련 포맷 제공
		 * - yyyy : 연도 4자리, yy : 연도인데 2자리만
		 * - MM(대문자) : 달 2자리, M : 달 1자리
		 * - dd : 일 2자리, d : 일 1자리
		 * - hh : 시 2자리, h : 시 1자리, HH : 24시간제(0~23)
		 * - mm(소문자) : 분 2자리, m : 분 1자리
		 * - ss : 초 2자리, s : 초 1자리
		 * - E : 요일
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf2.format(today));
		
		Date today2 = new Date(125,10,20);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-M-d");
		System.out.println(sdf3.format(today2));
		
		System.out.println("--------------------------------------");
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf4.format(today));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf5.format(today));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy-MM-dd (E요일)");
		System.out.println(sdf6.format(today));
		
		String str1 = "20250819";
		String str2 = "2025-08-19";
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyy-MM-dd");
		Date strNow1;
		Date strNow2;
		try {
			strNow1 = sdf7.parse(str1);
			strNow2 = sdf8.parse(str2);
			System.out.println(sdf7.format(strNow1));
			System.out.println(sdf8.format(strNow2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
