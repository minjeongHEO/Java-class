package kr.s02.local;

public class LocalMain02 {
	//�������
	int a = 100;
	//����޼���
	public void innerTest() {
		//���ó���Ŭ����
		class Inner{
			public void getData() {
				System.out.println("���� ��: " + a);
				System.out.println("-----------------");
				a = 200;
				System.out.println("���� ��: " + a);
			}
		}
		//���ó���Ŭ���� ��ü ����
		Inner i = new Inner();
		//�޼���ȣ��
		i.getData();// ����Ŭ������ �巯�������ʾƼ� �Ʒ��� �ڵ峻���� ��������
	}
	
	public static void main(String[] args) {
		LocalMain02 local = new LocalMain02();
		local.innerTest();
		
	}
	
}
