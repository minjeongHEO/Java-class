package kr.s09.abstracttest;

//�߻�Ŭ����
//�Ϲ������� �� �� �̻��� �߻�޼��带 ���� ����
//�߻�޼��尡 ���������ִµ� �� �ǹ̰� ����
abstract class A2{
	//�߻�޼��� abstract���̰��߰�ȣ�� �����ʰ� ;
	//�Ϲ�Ŭ���������� �߻�޼��� ���������.
	public abstract void getA();
	//�Ϲݸ޼���
	public void make() {
		System.out.println("make �޼���");
	}
}
//�߻�Ŭ������ ��ӹ����� �߻�Ŭ������ ������ �ִ� �߻�޼��带
//�ڽ�Ŭ������ �ݵ�� �����ؾ��Ѵ�
class B2 extends A2{
	//�θ�Ŭ������ �߻�޼��� �ݵ�� ����
	@Override
	public void getA() {
		System.out.println("getA �޼���");
	}
	
}
public class AbstractMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.make();
		bp.getA();
	}

}
