package kr.s01.extention;

//�θ� Ŭ����
class A{
	int x =100;//�����Ǿ��ִ� default�� ���� ��Ű�����׸������� ȣ�Ⱑ���ϰ� �ٸ������� ������ ȣ��Ұ�
	private int y = 200; //����ȭ
	
	public int getY(){//����� �ټ� �ִ� ��Ұ� �ִٸ� �����������ִ��� ��ӵ� �Ǿ����� ȣ�⵵ �ȴ�.
		return y;
	}
}
//�ڽ� Ŭ����
class B extends A{
	int z = 300;
}

public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		//private��������� ��Ӱ��踦 �ξ ���� Ŭ������ �ƴϱ� ������ ȣ���� �Ұ�
//		System.out.println(bp.y);//��Ӱ��躸�� private�� �켱�̹Ƿ� ����̾ȉ�
		System.out.println(bp.getY());
		System.out.println(bp.z);
		
	}
}
