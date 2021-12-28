package kr.s01.thread;

public class ThreadMain04 implements Runnable {
	
	//Runnable�� run�޼��� ����
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("������ �̸�: "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		//Ÿ����ü ����
		ThreadMain04 tm = new ThreadMain04();
		
		Thread t1 = new Thread(tm,"ù��°***");
		t1.start(); //ThreadMain04 ��ü�� run�޼��� ȣ��
		Thread t2 = new Thread(tm,"�ι�°~~~");
		t2.start(); //ThreadMain04 ��ü�� run�޼��� ȣ��
		Thread t3 = new Thread(tm,"����°===");
		t3.start(); //ThreadMain04 ��ü�� run�޼��� ȣ��
		
		//�����Ҷ����� ���� �޶�����.
		//���ü����� �߿��Ѱ� ������ �߿�x
	}
}
