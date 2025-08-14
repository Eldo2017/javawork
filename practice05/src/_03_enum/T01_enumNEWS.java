package _03_enum;

import java.util.Calendar;

public class T01_enumNEWS {

	public static void main(String[] args) {
		NEWS news1 = NEWS.EAST;
		System.out.println(news1);
		
		NEWS news2 = NEWS.valueOf("WEST");
		System.out.println(news2);
		
		NEWS news3 = NEWS.valueOf(NEWS.class, "SOUTH");
		System.out.println(news3);
		
		switch(news1) {
		case EAST:
			System.out.println("동쪽");
			break;
		case WEST:
			System.out.println("서쪽");
			break;
		case SOUTH:
			System.out.println("남쪽");
			break;
		case NORTH:
			System.out.println("북쪽");
		}
		System.out.println("-----------------------------");
		
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일을 얻어와라
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 : " + day);
		
		Week today = null;
		
		switch(day) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
		}
		
		if(today==Week.SUNDAY) {
			System.out.println("오늘 하루 푹 쉬시우");
		}
		else {
			System.out.println("열심히 몸 단련하고 공부하는 거 잊지 마시우");
		}
		
		// 오늘이 해당하는 달 얻기 (0~11)
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("현재 월 : " + month);
		
		MONTH month2 = null;
		
		switch(month) {
		case 1:
			month2 = MONTH.JANUARY;
			break;
		case 2:
			month2 = MONTH.FEBRUARY;
			break;
		case 3:
			month2 = MONTH.MARCH;
			break;
		case 4:
			month2 = MONTH.APRIL;
			break;
		case 5:
			month2 = MONTH.MAY;
			break;
		case 6:
			month2 = MONTH.JUNE;
			break;
		case 7:
			month2 = MONTH.JULY;
			break;
		case 8:
			month2 = MONTH.AUGUST;
			break;
		case 9:
			month2 = MONTH.SEPTEMBER;
			break;
		case 10:
			month2 = MONTH.OCTOBER;
			break;
		case 11:
			month2 = MONTH.NOVEMBER;
			break;
		case 12:
			month2 = MONTH.DECEMBER;
			break;
		}
		
		if(month2 == MONTH.JUNE || month2 == MONTH.JULY || month2 == MONTH.AUGUST) {
			System.out.println("엄청 뜨거워지는 날이니 몸 녹지 않도록 조심하시오");
		}
		else if(month2 == MONTH.DECEMBER || month2 == MONTH.JANUARY || month2 == MONTH.FEBRUARY){
			System.out.println("엄청 차가워지는 날이니 몸 얼지 않도록 조심하시오");
		}
		else {
			System.out.println("아무런 이상도 없으니 나가놀으셔도 됩니다");
		}
	}
}
