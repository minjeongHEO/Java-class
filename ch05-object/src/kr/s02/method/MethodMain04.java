package kr.s02.method;

import java.util.Scanner; //��

/*
 * Account
 * 1)�������: ���¹�ȣ(account_num),������(name),�ܰ�(balance)
 * 2)����޼���:1.�����ϱ�(deposite)(=balance�� ����)
 * 			���� ó�� �� �Ա��� �Ϸ�Ǿ����ϴ�. ���� ���
 * 			2.����ϱ�(withdraw)(=balance�� ����)
 * 			��� ó�� �� ����� �Ϸ�Ǿ����ϴ�. ���� ���
 * 			3.��������(printAccount): ���¹�ȣ, ������, �ܰ� ���
 * MethodMain04
 * 1)Account ����
 * 2)���� �⺻ ���� �Է�: ���¹�ȣ, ������, �ܰ�,
 * 3)���� ���� ���
 * 4)�Ա��ϱ�
 * 5)���� ���� ���
 * 6)����ϱ�
 * 7)���� ���� ���
 */
class Account{
	String account_num;
	String name;
	int balance;

	public void deposite(int m) {
		balance += m;
		System.out.println(m+"�� �Ա��� �Ϸ�Ǿ����ϴ�.");
	}
	public void withdraw (int m) {
		balance -= m;
		System.out.println(m+"�� ����� �Ϸ�Ǿ����ϴ�.");
	}
	public void printAccount() {
		System.out.println("���¹�ȣ:"+account_num+",������:"+name+",�ܰ�:"+balance);

	}
}
public class MethodMain04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//���� ����
		Account me = new Account();
		//	MethodMain04 me = new MethodMain04();
		System.out.print("���¹�ȣ:");
		me.account_num = input.nextLine();
		System.out.print("������:");
		me.name = input.nextLine();
		System.out.print("�ܰ�:");
		me.balance = input.nextInt();
		
		/*
		//�������� ���
		me.printAccount();

		//�Ա�
		System.out.print("�Աݾ�: ");
		me.deposite(input.nextInt());

		//�������� ���
		me.printAccount();

		//���
		System.out.print("��ݾ�: ");
		me.deposite(input.nextInt());

		//�������� ���
		me.printAccount();*/
		
		/*me.name="ȫ�浿";
		me.account_num = "578-20-177-454";
		me.balance = 50000;

		me.printAccount();

		System.out.println("�Ա��ϱ�> 5000��");
		me.deposite(5000);
		me.printAccount();

		me.withdraw(5000);
		me.printAccount();*/

		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------------");
			
			System.out.print("�޴� ����> ");
			int num= input.nextInt();
			
			if(num == 1) {
				System.out.println("���ݾ�>");
				me.deposite(input.nextInt());
			}else if(num==2) {
				System.out.println("��ݾ�>");
				me.withdraw(input.nextInt());
			}else if(num==3) {
				me.printAccount();
			}else if(num==4) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
		input.close();
	}
}
