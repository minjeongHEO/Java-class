package kr.s04.thistest;

public class ThisMain {
	
	public ThisMain() {//������
		System.out.println("��ü ����: "+this);//this: �������� ������ �ֱ⿡ ��ü���ο��� ����� ���ִ� ���������� ����
//													��ü���� ��쿡�� �̸����� �ڱ��ڽ��� ��Ī�Ѵ�.
//													��ü���ο��� ��ü�� ����ų ��(��Ī)
//													ex)���� ���� ��Ī�Ҷ� �̸��Ἥ 3��Īȭ�� ���� �ʵ���, myself��� ����
	}
	
	public static void main(String[] args) {
		ThisMain tt = new ThisMain(); // tt:��������(��ü�� �ּҰ� ���ִ�)
		System.out.println("��ü ���� �� : "+ tt); //�ּҰ� ����Ǵ°� ������ ��µǴ°� �������̴�.@���� = ����ũ�Ѽ��� = (16����)�ؽð�
//													���� ��ü���� �ٸ���ü������ ��,������ �ϴ� �뵵
	}
}