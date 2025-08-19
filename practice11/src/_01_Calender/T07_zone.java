package _01_Calender;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class T07_zone {

	public static void main(String[] args) {
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		ZonedDateTime londonDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		ZonedDateTime cairoDT = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
		
		System.out.println(seoulDT);
		System.out.println(londonDT);
		System.out.println(cairoDT);
		
		// Calendar 사용 (예: 호주의 시드니 시간)
		TimeZone tz = TimeZone.getTimeZone("Australia/Sydney");
		Calendar now = Calendar.getInstance(tz);
		System.out.println("Sydney Hour: " + now.get(Calendar.HOUR));
		System.out.println("Sydney Minute: " + now.get(Calendar.MINUTE));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(tz);
		System.out.println("Sydney Time: " + sdf.format(now.getTime()));
	}

}
