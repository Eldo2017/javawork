package _01_Calender;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T06_localDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println(today);
		
		LocalDateTime startDay = LocalDateTime.of(2025, 8, 4, 15, 0, 0);
		LocalDateTime endDay = LocalDateTime.of(2026, 3, 13, 22, 20, 0);
		
		System.out.println(startDay + "부터 " + endDay + "까지");
		
		// 날짜 포맷 지정
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		
		System.out.println("시작일 : " + dtf1.format(startDay));
		System.out.println("종료일 : " + endDay.format(dtf1)); // 날짜와 포맷의 자리를 바꿔도 가능하다
		
		System.out.println("------------------------------------------");
		
		// isBefore(), isAfter(), isEqual()
		if(today.isBefore(endDay)) System.out.println("수업 진행 중");
		else if(today.isAfter(endDay)) System.out.println("이미 끝난 수업");
		else if(today.isEqual(endDay)) System.out.println("수업 마지막 날");
		else System.out.println("수업 신청 가능");
		
		System.out.println("------------------------------------------");
		
		Duration d = Duration.between(startDay, endDay);
		System.out.println(d.getSeconds());
		
		System.out.println("------------------------------------------");
		
		System.out.println("종료일까지는 " + today.until(endDay, ChronoUnit.MONTHS) + "개월 남았다");
		System.out.println("종료일까지는 " + today.until(endDay, ChronoUnit.DAYS) + "일 남았다");
		System.out.println("종료일까지는 " + today.until(endDay, ChronoUnit.HOURS) + "시간 남았다");
		
		System.out.println(today.plusYears(3).format(dtf1));
		System.out.println(today.plusMonths(5).format(dtf1));
		System.out.println(today.plusDays(100).format(dtf1));
		
		System.out.println("------------------------------------------");
		
		System.out.println(today.minusYears(3).format(dtf1));
		System.out.println(today.minusMonths(5).format(dtf1));
		System.out.println(today.minusDays(100).format(dtf1));
	}

}
