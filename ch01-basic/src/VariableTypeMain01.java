
public class VariableTypeMain01 {
//ũ��� �ϱ�
	public static void main(String[] args) {
		System.out.println("====����====");
//		����(true, false) ũ��: 1byte
	
		boolean b = true;
		System.out.println("b="+ b);
	
		System.out.println("====������====");
//		������, ũ��: 2byte, (ǥ������: 0~65,535)
//		�ٱ��� ó���� ���� �����ڵ�(unicole)���
		char c1 = 'A';
		System.out.println("c1 : " + c1);
		
		char c2 = 65;//�ڷ����� ������(char)�̹Ƿ� A�� �ƽ�Ű �ڵ尪 65�� ���� ��, A ��� 
		System.out.println("c2 : " + c2);
		
		char c3 = '\u0041'; //A�� �����ڵ尪, \ u(=�����ڵ� ǥ��) + 16����
		System.out.println("c3 : " + c3);
		
		char c4 = '��';
		System.out.println("c4 : " + c4);
		
		char c5 = '\uc790';//���� �����ڵ尪 / �ѱ��� ������ �����ڵ尪���θ� ǥ�� ���� / �ƽ�Ű�ڵ�x
		System.out.println("c5 : " + c5);
		
		System.out.println("====������====");
//		byte, ũ��: 1byte, (ǥ������: -128 ~ 127)
//		�Ϲ����� ����� ������� �����,�������� �� ���� ���
		byte b1 = 127;
		System.out.println("b1 : " + b1);
		
//		short, ũ��: 2byte, (ǥ������: -32,768 ~ 32,767)
		short s1 = 32767;
		System.out.println("s1 : " + s1);
		
//		int, ũŰ: 4byte, (ǥ������: -2,147,483,648 ~ 2,147,753,647)
		int n1 = 1000;
		System.out.println("n1 : " + n1);
		
//		long, ũ��: 8byte, �������α׷� ���� �� (��, �� ����) 
		long lg = 1000L;//int�� �����ϱ� ���� �ڷ���L ����Ѵ�.(������ ���� ������ ���������� long���� ǥ���ϱ� ����)
		System.out.println("lg : " + lg);
		
		System.out.println("====�Ǽ���====");
//		byte�� �������� ���е��� ����
//		�Ǽ��������� double�� �⺻���̴�.
//		float, ũ��: 4byte
		float f1 = 4.5f;
		//float f1 = 4.5; double�� �ν��Ͽ� ����
		System.out.println("f1 : " + f1);
		
//		double, ũ��: 8byte
		double d1 = 9.8;
		System.out.println("d1 : " + d1);
		
		System.out.println("====���ڿ� ǥ��====");
//		���ڿ� ǥ��(�⺻�ڷ����� �ƴ϶� �����ڷ���!)
//		�⺻�ڷ����� �ҹ��ڷ� ����
//		�����ڷ����� �빮�ڷ� ����
		String str = "Hello world!";
		System.out.println("str : " + str);
		
	}
}
