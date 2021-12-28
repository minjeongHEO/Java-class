package kr.s03.date;
//java.lang은 가끔
//java.util은 기본패키지가 아니라 import 해줘야함
//import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class DateMain {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		Date now = new Date();
		System.out.println(now);
		
		//deprecated되어 사용하지 않음
		System.out.println(now.toLocaleString());
		System.out.println("--------------------");
		
		DateFormat df = DateFormat.getDateInstance();
//		데이트포멧안에포맷이란 메소드가있다
		String today = df.format(now);
		System.out.println(today);
		System.out.println("---------------------");
		
		df=DateFormat.getDateTimeInstance();
		today = df.format(now);
		System.out.println(today);
		System.out.println("----------------------");
		
//		24시 표기법
//		SimpleDateFormat sf = 
//				new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH:mm:ss");//표기법은 API참고
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a HH:mm:ss");//표기법은 API참고
		today = sf.format(now);
		System.out.println(today);
	}
}
