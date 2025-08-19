package _01_Calender;

import java.util.Calendar;

public class T02_calendar_set {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		date1.set(2025, 8-1, 4);
		
		int month = date1.get(Calendar.MONTH);
		System.out.println(month+1 + "월");
		
		date1.set(2025, 8-1, 4, 15, 1, 1);
		System.out.println(date1.get(Calendar.HOUR)+"시");
		
		// add() : 기존 날짜에 다른 날 또는 달, 연도를 가산한다
		date1.add(Calendar.DATE, 100);
		System.out.println("개강일로부터 100일 후는 " + (date1.get(Calendar.MONTH) + 1)
		+ "월 " + date1.get(Calendar.DATE) + "일");
		
		date1.add(Calendar.DATE, -100);
		System.out.println("100일 전은 " + (date1.get(Calendar.MONTH) + 1)
		+ "월 " + date1.get(Calendar.DATE) + "일");
		
		date1.add(Calendar.MONTH, 2);
		System.out.println("2달 후는 " + (date1.get(Calendar.MONTH) + 1)
		+ "월 " + date1.get(Calendar.DATE) + "일");
	}
}
