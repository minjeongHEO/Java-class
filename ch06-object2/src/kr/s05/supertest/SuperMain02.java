package kr.s05.supertest;

//�θ� Ŭ����
class People{
	int a = 100;
	
	public People() {
		super();//people�� �θ�Ŭ����object �� �⺻�����ڸ� �Ϲ������� ��þ��ص� �ڵ����� ��
	}
}
//�ڽ� Ŭ����
class Students extends People{
	int b = 200;

	public Students() {
		super();//�θ�Ŭ������ �⺻������ �Ϲ������� ��þ��ص� �ڵ����� ��
	}
}


public class SuperMain02 {
	public static void main(String[] args) {
		Students s = new Students(); //��ü ����
		System.out.println(s.a);
		System.out.println(s.b);
		System.out.println(s.toString());//toString�޼ҵ�� object������������
	}
}
