package kr.s08.bank;

public class MinusAccount extends BankAccount {
	//���̳ʽ� ����
	//BankAccount ���
	//���̳ʽ� �ѵ�(minusLimit)
	//�ѵ��� ������ ����ϱ� ������(withdraw),
	//���̳ʽ� �ѵ� ������ ���Ե� ������������(PrintAccount)->get,set�޼ҵ� ����
	private int minusLimit;
	
	public MinusAccount(String number, String name, int balance, int minusLimit) {
		super(number,name,balance); //��
		this.minusLimit = minusLimit;
	}
	
	@Override
	public void withdraw(int amount) {
		if(balance + minusLimit >= amount) {
			balance -= amount;
			System.out.printf("%,d���� ��ݵǾ����ϴ�.",amount);
		}else {
			System.out.println("�ѵ��ʰ��� ��ݵ��� �ʽ��ϴ�.");
		}
	}
	
	@Override
	public void printAccount() {
		System.out.println("���̳ʽ� ���¹�ȣ : "+ number);
		System.out.println("������ : "+ name);
		System.out.printf("�����ܾ� : %,d��\n",balance);
		System.out.printf("���̳ʽ� �ѵ� : %,d��\n",minusLimit);
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
//			System.out.println("�ܰ���� üũ");
//		}else {
//			ba.balance -= money;
//		}
//		return balance;
//		
//}
