package kr.s11.inter;

interface Inter1{
	//�߻�޼���
	public abstract int getA();
}

interface Inter2{
	//�߻�޼���
	public abstract int getB();
}


//Inter1�� Inter2�� Inter3�� ���
interface Inter3 extends Inter1,Inter2{
//	public abstract int getA();�� ��� ��Ӱ��迡�־ �ִٰ� ģ��
	//�߻�޼���
	public abstract int getData();
}

interface Inter4{
	//�߻�޼���
	public abstract String getStr();
}

//�Ϲ�Ŭ������ Inter3�� �����غ���
class InterSub implements Inter3,Inter4{//,�� �߰��ؼ� ����Ҽ����ִ�.
	//�߻�޼��带 �������ؼ� Ŭ������ ������ ���
	//��ӹ޾Ƽ� ������ �޼ҵ带 ���� ����������Ѵ�
	@Override 
	public int getA() {
		return 10;
	}
	@Override 
	public int getB() {
		return 20;
	}
	@Override 
	public int getData() {
		return 30;
	}
	//Inter4�� �߻�޼��� ����
	@Override 
	public String getStr() {
		return "�߰�";
	}
}

public class InterMain03 {
	public static void main(String[] args) {
		InterSub is = new InterSub();
		System.out.println(is.getA());
		System.out.println(is.getB());
		System.out.println(is.getData());
		System.out.println(is.getStr());
	}

}
