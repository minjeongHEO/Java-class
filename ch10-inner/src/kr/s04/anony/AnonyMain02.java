package kr.s04.anony;
//�θ�Ŭ����(�Ϲ�Ŭ����)
class Inner7{
	int y = 200;
	public void disp() {
		System.out.println("�θ�Ŭ������ disp�޼���");
	}
}

public class AnonyMain02 {
	
	public void fun() {
		//���ó���Ŭ����
		//�͸���Ŭ������ ��ü ����
//		class ���� extends Inner7{ //�̸��� ���ٺ��� �������� ��ü������ ���� �̸��� �����پ��� ->(inner7)�θ��� �̸� 
		Inner7 i = new Inner7() //{�ڸ� �Ѷ������� �ν��Ѵ� (�͸���Ŭ������ Ŭ������) //�̸��� �����־ �̸�����°� ���ǹ�(�������� �̸�)
		{
			//Inner7�� disp�� ������
			@Override
			public void disp() {
				System.out.println("�ڽ�Ŭ������ disp�޼���");
			}
			
			//�͸���Ŭ������ ������ �޼���� ȣ���� �Ұ��ϴ� �������� �޼��常 ȣ���� �����ϴ� �ֳ� ����ȯ�� �Ǿ��⋚����
			//�����ʿ䰡 ���� ���ǹ��ϴ�
			public void make() {
				System.out.println("make �޼���");
			}
		}; //���⼭ ; ���� ������
		
		//�޼���ȣ��
		i.disp();
//		i.make();//Inner7Ÿ������ �θ𿵿����� ȣ������� �پ�� ȣ���� �� ����
	}
	
		//��ü ����
//		InnerTest i = new InnerTest();
//		i.disp();
//		i.make();
//	}
	
	public static void main(String[] args) {
		AnonyMain02 an = new AnonyMain02();
		an.fun();
	}
	
}
/*
 * ����Ŭ���� �̸��� ���� �߿������� ���Ƽ� �����ϴµ� 
 * Ÿ��
 * �����ڵڿ� {};������ ����Ŭ�����̴�
 * �ȵ���̵忡�� ���̾��̰� web������ �߾Ⱦ��δ�(���������� �Ϻκ�)
 */
