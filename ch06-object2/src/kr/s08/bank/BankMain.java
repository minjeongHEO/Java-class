package kr.s08.bank;

public class BankMain {
	public static void main(String[] args) {
		//���̳ʽ����»���
		MinusAccount ma = new MinusAccount("110-1234", "ȫ�浿", 1000,500);
		
		//���� ���
		ma.printAccount();
		
		//�Ա�
		ma.deposit(3100);
		ma.printAccount();
		
		//���
		ma.withdraw(4600);
		ma.printAccount();
	}
}
