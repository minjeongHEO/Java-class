package kr.s10.abstracttest;

//�θ�Ŭ�����̸鼭 �߻�Ŭ����
public abstract class Car {
	public void drive() {
		System.out.println("�޸���");
	}
	public void stop() {
		System.out.println("���ߴ�");
	}
	//�߻�޼���
	public abstract int getEnergy(); //�ڽ�Ŭ�������� �߻�޼��� �����ϱ�줿���ؼ�
									//��ȯ�� ���ؼ� �ڽ�Ŭ�������� ��ȯ������Ѵ�
									//{ ���� ;���� ������
}
