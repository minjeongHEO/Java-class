package kr.s08.bank;


public class BankAccount {
	//�Ϲݰ���
	/*
	 * ���¹�ȣ(number), ������(name), �ܰ�(balance)
	 * protected
	 * �����ڸ� �̿��ؼ� ���¹�ȣ, ������, �ܰ� ����
	 * �Ա��ϱ�(deposit),
	 * ����ϱ�(withdraw : ���� üũ -> �ܰ� �����̸� �ܰ����üũ)
	 * ������������(printAccount : �Ϲݰ��¹�ȣ, ������, �����ܾ�)
	 */
	protected String number;
	protected String name;
	protected int balance;
//	protected String number() {
//		return "123-4";
//	}
//	protected String name() {
//		return "�����";
//	}
//	protected int balance() {
//		return 100000;
//	}
	
	public BankAccount(String number,String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		System.out.println(number+"���°� �����Ǿ����ϴ�");
	}
//	int money;
//	BankAccount ba = new BankAccount();
//	private int balance;
	
	public void deposit(int amount) {
		balance += amount;
		System.out.printf("%,d���� �ԱݵǾ����ϴ�.\n",amount);
	}
//public int deposit(int money) {
//	return ba.balance() + money;
//}
	public void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.printf("%,d���� ��ݵǾ����ϴ�.\n",amount);
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
//public int withdraw(int money) {
//	if(balance()<0) {
//		System.out.println("�ܰ���� üũ");
//	}else {
//		ba.balance -= money;
//	}
//	return balance;

	public void printAccount() {
		System.out.println("�Ϲ� ���¹�ȣ: "+ number);
		System.out.println("������: "+ name);
		System.out.printf("���� �ܾ� : %,d��\n ",balance);
		System.out.println("----------------------");
	}
}

//public void printAccount(String a, String b, int c) {
//	System.out.println("�Ϲݰ��¹�ȣ : "+ a);
//	System.out.println("�Ϲݰ��¹�ȣ : "+ b);
//	System.out.println("�Ϲݰ��¹�ȣ : "+ c);
//	
//}


