package kr.s01.thread;
//�ΰ��� ���þ����� ����غ���
//runnable����غ���

public class ThreadMain03 implements Runnable{
	//Runnable��  run�޼��� ����
	@Override
	public void run() {
		System.out.println
		("run �޼���, �������̸� : "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println
		("main �޼���, �������̸� : "+ Thread.currentThread().getName());
		
		//Ÿ�ٰ�ü����
		ThreadMain03 tm = new ThreadMain03();
		
		//������ ����
		Thread t = new Thread(tm);//Ÿ�ٰ�ü ����
		t.start();
	}
}
/*
 * main�� �츮�� ���� �����尡 �ƴ϶�
 * main������
 * ����ƽ������ ������ �޸𸮿� �ö󰡰� ������ ���ν����忴�⶧���� ������ �Ѱ�
 */
