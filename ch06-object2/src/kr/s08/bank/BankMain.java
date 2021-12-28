package kr.s08.bank;

public class BankMain {
	public static void main(String[] args) {
		//마이너스계좌생성
		MinusAccount ma = new MinusAccount("110-1234", "홍길동", 1000,500);
		
		//정보 출력
		ma.printAccount();
		
		//입금
		ma.deposit(3100);
		ma.printAccount();
		
		//출금
		ma.withdraw(4600);
		ma.printAccount();
	}
}
