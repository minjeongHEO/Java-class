public class IfMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 생년월일을 입력하고 만 나이를 출력하는 프로그램작성
		 * 만 나이 = (현재년도 - 생년) - (생일이 지났으면 0/안지났으면1)
		 * 
		 * [출력예시]
		 * 연도 입력: 2001
		 * 월 입력 : 10
		 * 일 입력: 20
		 * 만 나이는 ? 입니다.
		 * < pinos71@daum.net >
		 */
		int thisYear = 2021;
		int thisMonth = 11;
		int thisDate = 3;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		int year,month,date;
		
		do{
			System.out.print("연도 입력: ");
			year = input.nextInt();
		}while(year<1 || year>9999);
		
		do {
			System.out.print("월 입력: ");
			month = input.nextInt();
		}while(1>month || month>12); 
			
		do {
			System.out.print("일 입력: ");
			date = input.nextInt();
		}while(date>31);
		
		int age = thisYear-year;
		if(thisMonth <= month) {
			if(thisDate < date) {
				age -= 1;
			}
		}
		/*if(thisMonth < month) {
			age--;
		}else if (thisMonth == month){
			if(thisDate < date) {
				age -= 1;
			}
		}*/
		
		System.out.printf("만 나이는 %d살 입니다.", age);
		
		input.close();
		
	}

}
