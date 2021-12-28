package kr.s03.date;

import java.util.Calendar;

public class CalendarMain01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR);//스태틱한 상수라는 걸 알수있따
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);//일
		
		System.out.println(year+"년"+month+"월"+date+"일");
		
		int day = today.get(Calendar.DAY_OF_WEEK);//요일 1(일)~7(토)
		
		String nday = "";
		switch(day){
		case 1: nday="일";break;
		case 2: nday="월";break;
		case 3: nday="화";break;
		case 4: nday="수";break;
		case 5: nday="목";break;
		case 6: nday="금";break;
		case 7: nday="토";break;
		}
		System.out.println(nday+"요일");
		
		int ampm = today.get(Calendar.AM_PM);//오전0, 오후1
		String str = ampm==Calendar.AM ? "오전" : "오후";
		System.out.println(str);
		
		int hour = today.get(Calendar.HOUR);//시, HOUR_Of_DAY: 24시표기법
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.println(hour+":"+min+":"+sec);//대문자아님 
		
	}
}
