package kr.s04.anony;
//�θ�Ŭ����(�Ϲ�Ŭ����)
class Inner6{
	int y = 200;
	public void disp() {
		System.out.println("Inner6�� disp �޼���");
	}
}

public class AnonyMain01 {

	public void fun() {
		//���ó���Ŭ����
		class InnerTest extends Inner6{
			int x = 300;
			public void make() {
				System.out.println("make�޼���");
			}
			@Override
			public void disp() {
				System.out.println("InnerTest�� disp�޼���");
			}
		}
		//���ó���Ŭ���� ����
		InnerTest i = new InnerTest();
		System.out.println(i.y);
		System.out.println(i.x);
		i.make();
		i.disp();
		System.out.println("----------------------------");
		Inner6 in = i;//�ڽ�Ŭ����Ÿ�Կ��� �θ�Ŭ����Ÿ������ ����ȯ
		System.out.println(in.y);
		in.disp();
//		System.out.println(in.x);
//		in.make();//�ڽ�Ŭ�������ִ°� ȣ���� �ȉ�
	}

	public static void main(String[] args) {
		AnonyMain01 an = new AnonyMain01();
		an.fun();
	}
}
