package kr.s03.date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//현재 날짜와 시간을 구함
		Calendar cal = Calendar.getInstance();
		System.out.println("희망 연도와 월을입력하세요!(ex 연도:2021,월:7)");
		System.out.print("연도: ");
		int year = input.nextInt();
		System.out.print("월: ");
		int month = input.nextInt();
		
		System.out.println("    [ "+year+"년 "+month+"월] ");
		System.out.println("--------------------------");
		System.out.println("  일 월  화  수  목 금  토");
		
		//희망 연도, 월, 일 셋팅(월의 범위는 0~11 이기 때문에 입력월-1)
		//일은 달력이 1일부터 시작하기 때문에 1일로 셋팅
				//연도, 	 월	,  1
		cal.set(year, month-1, 1);
		//1일의 요일 구하기(1:일요일, 7:토요일)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//월의 마지막 날짜 구하기
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		
		//첫날짜를 표시하기 전 공백 처리
		for(int i=1; i<week;i++){//week:첫날짜의 요일
			System.out.printf("%3s"," ");//공백을 표시하는데 세자리를 확보해라 (공백공백요일)=3자리
		}
		
		//1~마지막 날짜까지 날짜 표시
		for(int i=1; i<=lastOfDate; i++) {//토요일까지하고 줄바꿈 해야함
			System.out.printf("%3d", i);
			//토요일이면 줄바꿈 처리
			if(week%7==0)
				System.out.println();//단순줄바꿈
			week++;
		}
		System.out.println("\n---------------------");
		
		input.close();
		
	}
}
