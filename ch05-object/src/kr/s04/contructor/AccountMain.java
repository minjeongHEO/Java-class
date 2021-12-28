package kr.s04.contructor;

public class AccountMain {
	//�������
	String accountNo; //���¹�ȣ
	String ownerName;//������ �̸�
	int balance;//�ܰ�
	
	public AccountMain(String a, String o, int b)
	{
		accountNo = a;
		ownerName = o;
		balance = b;
		System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
	}
//�Ա��ϱ�
	public void deposite(int amount) {
		balance += amount;
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
	}
//����ϱ�
	public void withdraw(int amount) {
		balance -= amount;
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
//���� ��������
	public void printAccount() {
		System.out.println("���¹�ȣ: "+ accountNo);
		System.out.println("������ �̸�: "+ ownerName);
		System.out.printf("�ܰ� : %,d��\n", balance);
	}
	
	public static void main(String[] args) {
		//���� ����
		AccountMain am = new AccountMain("100-123","ȫ�浿",1000);
		
		//���� ����
		am.printAccount();
		
		//�Ա��ϱ�
		am.deposite(1000);
		am.printAccount();
		
		//����ϱ�
		am.withdraw(500);
		am.printAccount();
	}
	
}
