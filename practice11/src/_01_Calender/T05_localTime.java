package _01_Calender;

import java.time.LocalTime;

public class T05_localTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour()+"시");
		System.out.println(time.getMinute()+"분");
		System.out.println(time.getSecond()+"초");
		
		System.out.println("-------------------------");
		
		LocalTime time2 = LocalTime.of(11, 9, 36);
		System.out.println(time2);
	}

}
