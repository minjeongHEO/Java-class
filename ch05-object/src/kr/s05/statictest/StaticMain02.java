package kr.s05.statictest;

public class StaticMain02 {
	
	int a;// �ν��Ͻ� ����
	static String s; //����ƽ����(Ŭ��������)
	public static void main(String[] args) {
//		a = 10; //����>�ν��Ͻ������� �ݵ�� ��ü ���� ���Ŀ� ȣ���ؾ� �����ȳ���.
		
//		StaticMain02.s = "�ڹ��� ��"; //static�� �տ� Ŭ�������� �ٿ��� ȣ�� , ��ü ���� ����ȣ�⸸ �������� ���డ��
		s = "�ڹ��� ��";//main�� s�� ���� Ŭ���� �����ֱ� ������ �տ� Ŭ������ ���� �����ϴ�
		System.out.println("s = "+ StaticMain02.s);
		
	}
}
