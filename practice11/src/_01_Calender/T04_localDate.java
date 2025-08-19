package _01_Calender;

import java.time.LocalDate;

public class T04_localDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();	
		System.out.println(today);
		// Getter 메소드 사용
		System.out.println(today.getYear()+"년");
		System.out.println(today.getMonthValue()+"월");
		System.out.println(today.getMonth());
		System.out.println(today.getDayOfMonth()+"일");
		System.out.println("365일 중 " + today.getDayOfYear()+"일");
		System.out.println(today.getDayOfWeek() + " : 요일");
		System.out.println(today.getDayOfWeek().getValue()); // 1이면 월요일
		System.out.println("이 달은 총 " + today.lengthOfMonth()+"일까지 있다");
		System.out.println("올해는 총 " + today.lengthOfYear()+"일까지 있다");
		System.out.println("올해는 윤년인가? " + today.isLeapYear());
		
		System.out.println("-----------------------------------------");
		
		LocalDate day = LocalDate.of(2025,7,22);
		System.out.println(day);
	}
}
