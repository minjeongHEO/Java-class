package kr.s03.capsule;

class Capsule{
	//����ȭ
	//private�� ���� Ŭ���������� ���� ����
	private int a;//ex)���ܳ��� �ݰ� ��������� �߿��ѿ��
	
	//ĸ��ȭ .���������� ������� ������ ���ϰ��ϴ� ���� �������
	public void setA(int n) {//�����͸� �޴� �޼ҵ� ex)���� �޴� �����
		if(n>=0) {
			a = n;
			
		}else {//����
			System.out.println("������ ������ �ʽ��ϴ�.");
		}
	}
	public int getA() { //ex)���� ������ִ� �����
		return a;
	}
	
}

public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		//���� a�� ����������(������)�� private�̱� ������ ���� Ŭ���� �������� ȣ�� ����
		//�׷��� �ٸ� Ŭ���������� ȣ�� �Ұ���
//		cap.a = -10;
		
		cap.setA(100);//����������
		System.out.println(cap.getA());//������ ȣ��
		System.out.println("-------------------");
		
		cap.setA(-100);
		System.out.println(cap.getA());//������ ȣ��
		System.out.println("-------------------");
		
	}
}
