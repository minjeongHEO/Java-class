package kr.s02.method;

public class MethodMain01 {
	
	//����(�Ķ����)���� ��� : �� ȣ��(Call by value)
	//�⺻ �ڷ����� ���� ���ڷ� �����ϴ� ���. ���� �����Ͽ� ����
	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		
		MethodMain01 me = new MethodMain01(); //��ü�� �����ؾ� ������ ���ִ�.
//		increase(var1);//�����ڵ� ���� �̰͸� �ۼ��ϸ� ��������.
		
		
		int var2 = me.increase(var1);
		System.out.println("var1: "+ var1 + ",var2: "+ var2);
		
	}
}
