package kr.s06.poly;

class Parent2{
	public void make() {
		System.out.println("�θ�Ŭ������ make�޼���");
	}
}
class Child2 extends Parent2{
	@Override
	public void make() {
		System.out.println("�ڽ�Ŭ������ make�޼���");
	}
}
public class PolyMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.make();
		
		Parent2 p = ch;//�ڽ�Ŭ���� Ÿ�� -> �θ�Ŭ����Ÿ�� ����ȯ
						//��ĳ����, �ڵ������� ����ȯ
		//���߿�� �θ�Ŭ���� Ÿ������ ����ȯ�� �ص� �ڽ�Ŭ������ �޼��尡 �����ǰ� �Ǿ������� �����ǵ� �޼��� ȣ�� 
		p.make(); //����ȯ�� �ϴ��� �����ǰ� �켱�̶� ����� �޸� �ڽĿ����� make�� ��µȴ�.
					//������ ����� super() ����ϴ°�
	}
}
