package kr.s08.bank;

public class MinusAccount extends BankAccount {
	//마이너스 계좌
	//BankAccount 상속
	//마이너스 한도(minusLimit)
	//한도를 적용한 출금하기 재정의(withdraw),
	//마이너스 한도 정보가 포함된 계좌정보보기(PrintAccount)->get,set메소드 역할
	private int minusLimit;
	
	public MinusAccount(String number, String name, int balance, int minusLimit) {
		super(number,name,balance); //★
		this.minusLimit = minusLimit;
	}
	
	@Override
	public void withdraw(int amount) {
		if(balance + minusLimit >= amount) {
			balance -= amount;
			System.out.printf("%,d원이 출금되었습니다.",amount);
		}else {
			System.out.println("한도초과로 출금되지 않습니다.");
		}
	}
	
	@Override
	public void printAccount() {
		System.out.println("마이너스 계좌번호 : "+ number);
		System.out.println("예금주 : "+ name);
		System.out.printf("계좌잔액 : %,d원\n",balance);
		System.out.printf("마이너스 한도 : %,d원\n",minusLimit);
		System.out.println("------------------------------");
	}
	
	
}
//	protected float minusLimit() {
//		return -500;
//	}
//	MinusAccount ma = new BankAccount();
//	
//	public int withdraw(int money) {
//		if(balance<(-500)) {
//			System.out.println("잔고부족 체크");
//		}else {
//			ba.balance -= money;
//		}
//		return balance;
//		
//}
