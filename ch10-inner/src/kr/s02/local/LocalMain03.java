package kr.s02.local;

public class LocalMain03 {
	//�������
	int a=100;
	//��� �޼���
	public void innerTest() {
		//jdk7.0���Ͽ����� ���������� ����Ŭ�������� ����� �� ���� ������ 
		//final�� ����ؼ� ���ȭ �ؾ� ������ jdk8.0���� �ڵ����� ó����.
		//fianl int b = 200;
		
		//��������
		int b = 200;
		//���ó���Ŭ����
		class Inner{
			//����޼���
			public void getData() {
				System.out.println("a: "+a);//LocalMain03 �� ��������
				//��������b�� ���ó���Ŭ���������� �ڵ����� ���ȭ��
				System.out.println("b: "+b);//InnerTest�� ��������
				System.out.println("----------------------------");
				
				//�޼��� ���� ���������� ���ó���Ŭ�������� ȣ��� ��
				//���ȭ�� �Ǳ� ������ ������ ���� �Ұ���
//				b = 400;//���������� ���ó���Ŭ�������� ȣ���Ҷ� �ڵ�����final�� �ٴ´� ���ȭ�� �Ǿ���� �Ұ�
			}
		}
		//��ü����
		Inner i = new Inner();
		i.getData();
	}
	public static void main(String[] args) {
		//�����Ϸ��� ��ü�� �����ؾ��Ѵ�
		LocalMain03 local = new LocalMain03();
		local.innerTest();
		
	}
}
