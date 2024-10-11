package ch05.sec12;

import java.util.Calendar;
public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week day = null;
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//오늘 요일 얻어오기
		
		switch(week) {
		case Calendar.SUNDAY:
			day = Week.SUNDAY;
			break;
		case Calendar.MONDAY:
			day = Week.MONDAY;
			break;
		case Calendar.TUESDAY:
			day = Week.TUESDAY;
			break;
		case Calendar.WEDNESDAY:
			day = Week.WEDNESDAY;
			break;
		case Calendar.THURSDAY:
			day = Week.THURSDAY;
			break;
		case Calendar.FRIDAY:
			day = Week.FRIDAY;
			break;
		case Calendar.SATURDAY:
			day = Week.SATURDAY;
			break;
		
		}
		if (day == Week.SUNDAY) {
			System.out.println("여의도 불꽃 놀이");
		}
		else if (day == Week.MONDAY) {
			System.out.println("월요일");
		}
		else {
			System.out.println("공부하기");
		}

	}

}
