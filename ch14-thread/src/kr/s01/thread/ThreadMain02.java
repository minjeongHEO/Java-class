package kr.s01.thread;
//����� �����Ѽ� ��ȸ��Ű�� �ι�° ���
public class ThreadMain02 implements Runnable {
	
	//Runnable�������̽��� �߻�޼��带 �����ؾ� �Ѵ�.
	@Override
	public void run() {
		 for(int i=0;i<10;i++) {
			 try {
				 //�����尡 ����ƽ�Ѹ޼����ε� ��ӵǾ��ִ°� �ƴϴϱ� �տ� �����带 �ٿ��ش�.
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			 System.out.printf("������ �̸�: %s, ", Thread.currentThread().getName());//currentThread()�� ����ƽ�� �޼���� �տ� ������ ���δ�
			 System.out.printf("temp value: %d%n", i);
		 }
	}
	
	public static void main(String[] args) {
		//��ŸƮ�޼��尡 ���� �������� ��ӻ��°��ƴ϶�
		//run�޼��尡 �ִ� ��ü�� �����ϰ�
		ThreadMain02 tm = new ThreadMain02();
		
		
		//������ ��ü ����
					  //Tread(Ÿ�ٰ�ü,(�׾ȿ�)�������̸�)
		Thread t = new Thread(tm,"ù��°");//������� ���޼��带 �����ų���ִ� ��ü
		t.start(); //������ Ÿ�ٰ�ü�� run()�޼��� ȣ��
		
	}
}
