package kr.s09.abstracttest;
abstract class AbxEx1{
	int a = 100;
	int b = 200;
	final String STR = "abstract test";//���: ���ڸ� ���̾����� ���ڵ� �� ���ִ�
	//�Ϲݸ޼���
	public String getStr() {
		return STR;
	}
	//�߻�޼���
	abstract public int getA();
	public abstract int getB();//���������ڿ� abstract��ġ�� �ٲ��� �������
}
//�߻�Ŭ������ �߻�Ŭ���� ���
abstract class AbxEx2 extends AbxEx1{
	String msg = "�ż���";
	//�߻�޼��� ����
	@Override
	public int getA() {
		return a;
	}
	//�߻�޼���
	public abstract String getMsg();
}
public class AbstractMain03 extends AbxEx2{
	//�߻�޼��� ����
	@Override
	public int getB() {
		return b;
	}
	@Override
	public String getMsg() {
		return msg;
	}
	public static void main(String[] args) {
		AbstractMain03 ab = new AbstractMain03();
		System.out.println(ab.getB());
		System.out.println(ab.getMsg());

	}


}
