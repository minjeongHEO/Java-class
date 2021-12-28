public class WhileMain06 {
	public static void main(String[] args) {
//		console 프로그램 만들 시 while문을 가장 많이 이용
//		======은행 프로그램======
		java.util.Scanner input = new java. util.Scanner(System.in);
		
		int balance = 0; //잔고
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			
			System.out.println("메뉴 선택>");
			int num = input.nextInt();
			
			if(num == 1) {
				//예금은 누적
				System.out.print("예금액 > ");
				balance += input.nextInt(); //누적이므로 '='아님
				System.out.printf("잔고: %,d원\n",balance);
				
			}else if(num==2) {
				//출금은 차감
				System.out.print("출금액 > ");
				balance -= input.nextInt();
				System.out.printf("잔고: %,d원\n",balance);
				
			}else if(num==3) {
				System.out.printf("잔고: %,d원\n",balance);
				
			}else if(num==4) {
				System.out.println("프로그램 종료");
				break;
				
			}else {
				System.out.println("잘못 입력하였습니다.");
				//break;
			}
		}
		
		input.close();
		
		
}
}
