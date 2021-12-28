package kr.s02.overloading;

public class OverloadingMain01 {
	/*
	 * Method Overloading(�ߺ�����)�� �ϳ��� Ŭ���� ������ ���� �̸��� ������ �޼��尡
	 * ���� �� ���ǵǴ� ���� ���Ѵ�. 
	 * �޼��带 �������ִ� ��ҷ� ������ Ÿ��, ����, ��ġ�� ������ �̿��ϰ�
	 * �ٸ� ��쿡 �ٸ� �޼���� �ν��Ѵ�.
	 */
	
	public void print(int n) {
		System.out.println("���� n = " + n);
	}
//	public void print(int a) { //�޼ҵ��̸��� �ߺ��Ǿ� �浹�� ���� 1.������ �ڷ����� ���� 2.������ ������ ����
//		System.out.println("���� a = " + a);
//	}
	public void print(double a) { //�޼ҵ��̸��� �ߺ��Ǿ� �浹�� ���� 1.������ �ڷ����� ���� 2.������ ������ ����
		System.out.println("���� a = " + a);
	}
	public void print(double n, long a) {
		System.out.println("�Ǽ� n ="+ n + ",���� a =" + a);
	}
	public void print(long a, double n) {
		System.out.println("���� a ="+ a + ",�Ǽ� n =" + n);
	}

	public static void main(String[] args) {
		OverloadingMain01 ot = new OverloadingMain01();
		ot.print(20); //Ÿ���� int �̹Ƿ� n���� ����
		ot.print(5.6); //Ÿ���� double�̹Ƿ� a�� ����
		ot.print(5.6, 1234L); //Ÿ���� �ΰ�
		ot.print(1000L, 5.8); //Ÿ���� �ΰ��� ����
		
		
	}
}
