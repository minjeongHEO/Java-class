package kr.s01.a;
class Worker {
	/*
	 * worker
	 * 1)�������: �����̸�(name) �޿�(money) ���� �ܰ�(balance)
	 * 2)����޼��� : work(�����ϸ� money�� 1000 ����),
	 * 			  deposite(�����ϸ� money�� ���� balance�� ������Ű�� money�� 0)
	 * MethodMain04
	 * 1)Worker��ü ����
	 * 2)������ �̸� ����
	 * 3)10�� ���Ѵ��� �� ���� 3000���� ������ ���¿� ����
	 * 4)�����̸�, ���� ���¿� �Աݵ��� �ʰ� ���� �ִ� �޿�(money),
	 *   �����ܰ�(balance)�� ���
	 */
	String name;
	int money;
	int balance;
	
	//���ϴ� �޼���
	public void work() { //��ȯ�� �ƴ϶� �����̶� void����ؾ��� void�� return�Ⱦ�
		 money += 1000;
	}
	public void deposite() {
		balance += money;
		money = 0;
	}
}

public class MethodMain04 {
	public static void main(String[] args) {
		//��ü ����� ���� ����!
		Worker worker = new Worker();
		worker.name = "ȫ�浿";
		
		//10�� ���ϴµ� �� ���� 3000�� �϶� ���� ����
		for(int i=1;i<=10;i++) {
			worker.work();
			if(worker.money>=3000) {
				worker.deposite();
			}
		}
		
		System.out.println("���� �̸�: "+ worker.name);
		System.out.printf("���� �Աݵ��� ���� �޿�: %,d\n",worker.money);
		System.out.printf("������ �ܰ� : %,d��",worker.balance);
		
		/*int i=1;
		while(i<=10) {
			if(worker.balance<3000) {
				worker.deposite();
			}else {
				worker.work();
			}
		}*/
			
		
		
		
	}
}
