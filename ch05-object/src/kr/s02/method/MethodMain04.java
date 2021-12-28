package kr.s02.method;

import java.util.Scanner; //★

/*
 * Account
 * 1)멤버변수: 계좌번호(account_num),예금주(name),잔고(balance)
 * 2)멤버메서드:1.예금하기(deposite)(=balance값 누적)
 * 			예금 처리 후 입금이 완료되었습니다. 문구 출력
 * 			2.출금하기(withdraw)(=balance값 차감)
 * 			출금 처리 후 출금이 완료되었습니다. 문구 출력
 * 			3.계좌정보(printAccount): 계좌번호, 예금주, 잔고 출력
 * MethodMain04
 * 1)Account 생성
 * 2)계좌 기본 정보 입력: 계좌번호, 예금주, 잔고,
 * 3)계좌 정보 출력
 * 4)입금하기
 * 5)계좌 정보 출력
 * 6)출금하기
 * 7)계좌 정보 출력
 */
class Account{
	String account_num;
	String name;
	int balance;

	public void deposite(int m) {
		balance += m;
		System.out.println(m+"원 입금이 완료되었습니다.");
	}
	public void withdraw (int m) {
		balance -= m;
		System.out.println(m+"원 출금이 완료되었습니다.");
	}
	public void printAccount() {
		System.out.println("계좌번호:"+account_num+",예금주:"+name+",잔고:"+balance);

	}
}
public class MethodMain04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//계좌 생성
		Account me = new Account();
		//	MethodMain04 me = new MethodMain04();
		System.out.print("계좌번호:");
		me.account_num = input.nextLine();
		System.out.print("예금주:");
		me.name = input.nextLine();
		System.out.print("잔고:");
		me.balance = input.nextInt();
		
		/*
		//계좌정보 출력
		me.printAccount();

		//입금
		System.out.print("입금액: ");
		me.deposite(input.nextInt());

		//계좌정보 출력
		me.printAccount();

		//출금
		System.out.print("출금액: ");
		me.deposite(input.nextInt());

		//계좌정보 출력
		me.printAccount();*/
		
		/*me.name="홍길동";
		me.account_num = "578-20-177-454";
		me.balance = 50000;

		me.printAccount();

		System.out.println("입금하기> 5000원");
		me.deposite(5000);
		me.printAccount();

		me.withdraw(5000);
		me.printAccount();*/

		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			
			System.out.print("메뉴 선택> ");
			int num= input.nextInt();
			
			if(num == 1) {
				System.out.println("예금액>");
				me.deposite(input.nextInt());
			}else if(num==2) {
				System.out.println("출금액>");
				me.withdraw(input.nextInt());
			}else if(num==3) {
				me.printAccount();
			}else if(num==4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
		input.close();
	}
}
