package kr.s02.local;
//��� �޼ҵ�
public class LocalMain01 {
	public void innerTest() {
		//���ó��� Ŭ����
		class Inner{
			public void getData() {
				System.out.println("Local����Ŭ����");
			}	
		}
		//���� ���� Ŭ���� ��ü ����
		Inner i = new Inner();
		//�޼��� ȣ��
		i.getData();
	}

	public static void main(String[] args) {
		LocalMain01 local = new LocalMain01();
		local.innerTest();


	}
}


