package kr.s05.wrapper;

public class WrapperMain02 {
	public static void main(String[] args) {
		//��������� ��ü ����
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);
		
		//�����͸� �̾Ƴ�����
		//����			Integer->int
		int result = obj1.intValue() + obj2.intValue();
		System.out.println("result= "+result);
		
		System.out.println("------------��������̾��� ������------------");
		
		//�Ͻ������� ��ü ����
		//�̾ƿ��� �����ʿ���� �����͸� �׳� �����ؼ� �����Ѵ�. ���������� �ڵ���ȯ�Ǳ⶧��
		Integer obj3 = 10;
		Integer obj4 = 20;
		Integer result2 = obj3 + obj4;
		int result3 = obj3 + obj4;//(���������� �Ϲݺ����ΰ�ó��)�⺻�ڷ������� ����ϴ¹�������(���������� �ڵ���ȯ)
		System.out.println("result2= "+result2);
		System.out.println("�ڵ���ȯ result3= "+result3);
	}
}
