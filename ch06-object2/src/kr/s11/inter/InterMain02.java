package kr.s11.inter;

interface A2{
	//�߻�޼���
	public abstract void getA();//����
	void getB(); //���������ڰ�default�� �ƴ϶� public abstract�� ����
}
//�޸𸮿� �ø��������� -> �Ϲ�Ŭ������ �ο�(����)�ؼ� ����Ѵ�.

//�������̽��� Ŭ������ ����
class B2 implements A2{ //A2�� B2�� �����ϰڴ�
	//�߻�޼��尡 ȣ������ʵ��� ������ ����� ������ �ȳ���. �������̽��� �߻�޼��带 ����
	@Override
	public void getA() {
		System.out.println("getA �޼���");
	}
	@Override
	public void  getB() {
		System.out.println("getB �޼���");
	}
}

public class InterMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.getA();
		bp.getB();
	}

}
/*�߻�Ŭ������ �������̽��� ����
 * �߻�Ŭ������ �Ϲݸ޼��� ���� ��������������
 * �������̽��� Ŭ������ �ƴϰ� ����ƴϸ� �߻�޼��常 �������ִ�,
 */
