package kr.s05.wrapper;

public class WrapperMain01 {
	public static void main(String[] args) {
		boolean b = true;//�⺻�ڷ��� ������
		//��ü�� �����غ��� Ŭ�����⶧���� �빮�ڷ� ����
		//����� ��ü ����
		Boolean wrap_b = new Boolean(b);//�����ڰ� ���ø�����Ʈ����µ� 
		//�Ͻ��� ��ü ����
		Boolean wrap_b2 = b;//����Ŭ������ �Ͻ��� ��ü�������� ����ؾ��Ѵ�.
							//�����ڷ��� ������
		//�⺻�ڷ��������ͷ� ����ϰų� �����ڷ��������͸� ����� ���ִµ� ���ڴ� ���̤ø� ó���ϴ� �޼ҵ尡 �ʿ��ϱ⋚����
		//���ڵ� �ʿ��ϴ�.
		System.out.println(wrap_b2);
		
		//����� ��ü ����
		Integer wrap_i = new Integer(200);
		//�Ͻ��� ��ü ����
		Integer wrap_i2 = 200;
		System.out.println(wrap_i2);
	}
}
