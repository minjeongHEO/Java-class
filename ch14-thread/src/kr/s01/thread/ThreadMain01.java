package kr.s01.thread;
//��Ģ������ ����� ù��° ���

public class ThreadMain01 extends Thread { //������ȿ� ���޼��带 �������ؼ� �����۾��� �Ҽ� �ֵ�.

	public ThreadMain01(String threadname) {
		super(threadname);// �̸��� �ο����Ҷ��� 
		
	}

	//Thread�� run�޼��� ������
	@Override
	public void run() { //�����۾��� �ɷ��� run()
		//���� �����ϴ� ������ ��ü�� ��ȯ
		Thread t = currentThread();
		System.out.println("���� ������: "+ t);
		
		for(int i=0;i<10;i++) {
			try {
					 //�и�������(õ���� ����) ����
				sleep(1000); //������ �ð���ŭ ������ ���� 1000�̸� 1��
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			//getName() : �������� �̸� ��ȯ / ?currentThread(): run�޼��尡 ������ ��ü�� �����?
			System.out.printf("������ �̸�: %s ,", currentThread().getName());//sleep currenthread �޼���� ����ƽ�ϰ� ��Ģ�����δ� 
																			//�տ� thread. ���ٿ��������� ��ӵǾ��ֱ⶧���� �����Ѵ�
			System.out.printf("temp value: %d \n",i);
		}

	}

	public static void main(String[] args) {
		//��ü����
		ThreadMain01 tm = new ThreadMain01("ù��°");
		tm.start();//start�޼��带 �����ϸ� run�޼��带 �����Ѵ�.

	}
}
