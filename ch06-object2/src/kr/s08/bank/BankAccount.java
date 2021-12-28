package kr.s08.bank;


public class BankAccount {
	//일반계좌
	/*
	 * 계좌번호(number), 예금주(name), 잔고(balance)
	 * protected
	 * 생성자를 이용해서 계좌번호, 예금주, 잔고를 셋팅
	 * 입금하기(deposit),
	 * 출금하기(withdraw : 조건 체크 -> 잔고가 음수이면 잔고부족체크)
	 * 계좌정보보기(printAccount : 일반계좌번호, 예금주, 계좌잔액)
	 */
	protected String number;
	protected String name;
	protected int balance;
//	protected String number() {
//		return "123-4";
//	}
//	protected String name() {
//		return "허민정";
//	}
//	protected int balance() {
//		return 100000;
//	}
	
	public BankAccount(String number,String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		System.out.println(number+"계좌가 개설되었습니다");
	}
//	int money;
//	BankAccount ba = new BankAccount();
//	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.printf("%,d원이 입금되었습니다.\n",amount);
	}
//public int deposit(int money) {
//	return ba.balance() + money;
//}
	public void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.printf("%,d원이 출금되었습니다.\n",amount);
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
//public int withdraw(int money) {
//	if(balance()<0) {
//		System.out.println("잔고부족 체크");
//	}else {
//		ba.balance -= money;
//	}
//	return balance;

	public void printAccount() {
		System.out.println("일반 계좌번호: "+ number);
		System.out.println("예금주: "+ name);
		System.out.printf("계좌 잔액 : %,d원\n ",balance);
		System.out.println("----------------------");
	}
}

//public void printAccount(String a, String b, int c) {
//	System.out.println("일반계좌번호 : "+ a);
//	System.out.println("일반계좌번호 : "+ b);
//	System.out.println("일반계좌번호 : "+ c);
//	
//}


