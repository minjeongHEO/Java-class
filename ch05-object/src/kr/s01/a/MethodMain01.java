package kr.s01.a;
public class MethodMain01 {
	//��ȯ�ϴ� �����Ͱ� �ִ� ���
	public int add(int a, int b){//��ȯ�� (������� �ڷ����� int�̴�) �޼ҵ��
		return a+b; //��ȯ�ϴ� �����Ͱ� �ִ°�� : ������ �޼ҵ�
	}
	//��ȯ�ϴ� �����Ͱ� ���� ���
	public void print(String str) {
		System.out.println(str);
	}
	public void print(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) { //main�޼ҵ�� void�ⱸ������ ��ȯ�Ǵ� �����;���
		//��ü ���� �� ����
		MethodMain01 method = new MethodMain01(); //�ʵ忡�� ������ ��þ��ص� �����Ϸ��� �⺻������ �־��ش�.
		//��ȯ�ϴ� �����Ͱ� �ִ� �޼��� ȣ��
		int result = method.add(5, 8);
		System.out.println("result = "+ result);
	
		//��ȯ�ϴ� �����Ͱ� ���� �޼��� ȣ��
//		int result2 = method.print("����"); void���̶� ����������. ������ ���������� �����Ͱ� ��� result2�� ���� �� ����.
		method.print("����");
		method.print(2);
	}
}
