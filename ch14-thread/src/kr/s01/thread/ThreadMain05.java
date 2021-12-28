package kr.s01.thread;

class MyRunnableTwo implements Runnable{
	@Override
	public void run() {
		System.out.println("run");
		first();
	}
	
	public void first() {
		System.out.println("first");
		second();
	}
	
	public void second() {
		System.out.println("second");
	}
	
}

public class ThreadMain05 {
	public static void main(String[] args) {
		System.out.println
				(Thread.currentThread().getName()+ " start");//�����̶�� �����尡��������� ������ �����Ŵ
		MyRunnableTwo mt = new MyRunnableTwo();
		//������ ��ü ����
		Thread myThread = new Thread(mt);
		myThread.start();//MyRunnableTwo�� run�޼��� ����
		
		//���� �����Ű�� ���� �޼ҵ尡�ִٸ� ���θ޼��嵿�۽�Ų��
		//join(): join()�޼��带 ȣ���� �����尡 ��������ǰ� ���� ������� ���� �� ������ ��ٸ�����
		try {
			myThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+ " end");
		
	}
}
