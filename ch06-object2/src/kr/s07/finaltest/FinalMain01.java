package kr.s07.finaltest;

public class FinalMain01 {
	//�ʵ�
	//���
	final int NUM = 10;
	//static ���
	public static final int NUMBER = 20;//static: ������ ���� (ȣ�⸸�ϸ���)
	
	public static void main(String[] args) {
//		int no = 30; //����
		final int NO = 30; //(��������)���, �̸��� �빮�ڷ�,��� ù���ڸ� ���� ���ٲ۴�
		System.out.println(NO);
		
		//����� ���� �Ұ���
		//NO = 100;
	
		//Ŭ���� ������ ����� ����� ��ü�� ���� �Ŀ� ����� ����
//		System.out.println(NUM);
		FinalMain01 fm = new FinalMain01(); //��ü ����
		System.out.println(fm.NUM); //��� ȣ��
		
		//static ��� ȣ��
		System.out.println(FinalMain01.NUMBER);
		System.out.println(NUMBER);//���� Ŭ���� �Ʒ��� �־ ��������
	}
}
