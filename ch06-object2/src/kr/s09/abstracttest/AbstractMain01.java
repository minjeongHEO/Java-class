package kr.s09.abstracttest;

//�߻�Ŭ���� 
//�̿ϼ��� �������� �ܵ����� ��ü ������ �Ұ����ϰ� �Ϲ������� �ڽ�Ŭ������ ��ӵǾ �����
//�θ����� �����ϴ�
abstract class A{
	private int x;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
}
//�߻�Ŭ������ �ܵ����� ����Ҽ��� ������ �θ�Ŭ���� ���� ����
class B extends A{
	int b = 200;
}
public class AbstractMain01 {
	public static void main(String[] args) {
		//�߻� Ŭ������ ��ü ������ �Ұ����ϴ�
//		A ap = new A();

		B bp = new B();
		bp.setX(100);
		System.out.println(bp.getX());
		System.out.println(bp.b);
	}
}
