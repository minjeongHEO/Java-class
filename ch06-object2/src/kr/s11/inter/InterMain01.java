package kr.s11.inter;

interface A1{
	//���
	public static final int W = 10;//���� ���� 
	int X = 20;// public static final�� �����ѰŶ� �ں����ƴ϶� ���
	static int Y = 30; //public final ����
	final int Z = 40; //public static����
	//ȣ�⸸�ϸ� ����ƽ������ �޸𸮿� �ö󰣴�
	//static�� Ŭ������ �ƴ϶� �������̽��� �ܵ����� ����Ҽ���� ��ü���� �Ұ���
}

public class InterMain01 {
	public static void main(String[] args) {
		//�������̽��� ��ü ���� �Ұ���
		//A1 ap = new A1();
		
		//static ����̱� ������ �������̽���.����� �������� ȣ����
		System.out.println("W = "+A1.W);
		System.out.println("X = "+A1.X);
		System.out.println("Y = "+A1.Y);
		System.out.println("Z = "+A1.Z);
		
		
	}
}
