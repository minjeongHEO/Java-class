package kr.s04.thistest;

class ThisTest{
	//����ȭ
	private int a;
	
	//ĸ��ȭ
	public void setA(int a) { //int a�� ���������� ���� ������ �Ҹ�ȴ�.
//							��������� ������������ ������ �Ʒ��Ͱ��� ��Ȱ�� ����Ƿ� this ����Ѵ�.
//		a = a;//���� ���ȿ��ִ� ������Ī�̹Ƿ� �´� ���������� �ν��̵ȴ�
//		a = n;//�׷��ٰ� int a�� n���� �ٲٰ� a=n;�ϸ� �ذ�� ���ִµ� ���ϴ� ������ java���� ĸ��ȭ�Ҷ� �μ��� �⺭������ ������� �����ϰ� ���� ��찡 ǥ���̱� ������(��Ī�� ���ؼ� ����ȭ�� ������ ���ְԲ� ���ϸ�Ī�� �ش�.)
		//���������� �������������� �����ϰ� ����߱� ������
		//��������� ���������� �����ϱ� ���� this�� �����
		this.a = a; //this.a�� ������� 
		
	}
	public int getA() {
		return a;
	}
}
public class ThisMain02 {
	
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(200);
		System.out.println(tt.getA());
	}
}
