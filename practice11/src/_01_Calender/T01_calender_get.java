package _01_Calender;

import java.util.Calendar;

public class T01_calender_get {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("현재 연도 : " + today.get(Calendar.YEAR));
		
		
		// 월은 0부터 시작 -> 항상 1을 더해야 한다
		System.out.println("현재 월 : " + (today.get(Calendar.MONTH) + 1));
		System.out.println("현재 달의 몇번째 주인가 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("현재 년도의 몇번째 주인가 : " + today.get(Calendar.WEEK_OF_YEAR));
		
		// 일
		System.out.println("몇 일 : " + today.get(Calendar.DATE));
		System.out.println("몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("365일 중 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
		
		// 요일
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		}
		System.out.println("---------------------------");
		
		// 시간
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		
		System.out.println("---------------------------");
		
		int ampm = today.get(Calendar.AM_PM);
		System.out.println(ampm); //0이면 오전(AM), 1이면 오후(PM)
		
		System.out.println("---------------------------");
		if(ampm == 0) System.out.println("오전 " + today.get(Calendar.HOUR) + "시 (AM)");
		else if(ampm == 1) System.out.println("오후 " + today.get(Calendar.HOUR) + "시 (PM)");
		
		System.out.println("---------------------------");
		
		System.out.println(today.get(Calendar.HOUR) + "시 " 
		+ today.get(Calendar.MINUTE) + "분 " + today.get(Calendar.SECOND) + "초");
	}
}
