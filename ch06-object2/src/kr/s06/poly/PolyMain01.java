package kr.s06.poly;

class Parent{
	int a = 100;
}
class Child extends Parent{
	int b = 200;
}
public class PolyMain01 {
	public static void main(String[] args) {
		Child ch = new Child(); //���ϵ� ��ä��������� ch�� �ּҰ� ���� �װ� ���ϵ� Ÿ��
		//���ϵ� Ÿ�� ch=���ϵ� ��ä��
		//�ڷ����� ���ȣ������� ����
		//child��ü�� �������� ���� ��ü�� ȣ�Ⱑ��
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch;//ch��ü�� �ּҸ� ParentŸ����p�� �Ѱ��ش�
					//�ڽ�Ŭ����Ÿ�� -> �θ�Ŭ����Ÿ������ ����ȯ
					//= ��ĳ����, �ڵ������� ����ȯ
		System.out.println(p.a);
//		System.out.println(p.b);//parentŸ���� �θ�Ŭ���� ������ ȣ�Ⱑ��/ 
								//�޸𸮿��� ������ȣ���Ҽ��ִ� �����ۿ��־ ȣ��Ұ� ������
		
		Child ch2 = (Child)p; //������ �ٿ��µ� child�� ������ ������ �ø��� ���⿡ ���� ����ȯ
						//�θ�Ŭ����Ÿ��->�ڽ�Ŭ����Ÿ�� ����ȯ
						//= �ٿ�ĳ����, ����� ����ȯ
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
		//(�����ڷ�������������ȯ)�̸��� ��Ӱ��迡 �־�� �� �� �ִ�. 
	}
}
