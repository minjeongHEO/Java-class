package kr.s04.thistest;

public class LocalVariable {//{:Ŭ���� ���� ����
//��������� Ŭ���������� ���������.
	//��� ���� //��ü ������ �ؼ� �޸𸮿� ���� �ö󰣴�.
	int b = 200;
	
	public void make() {
		//�������� : Ŭ�������� �����ϰ� �޼���,������,��� �� ������ ������ ����
		//			 				�ش� ���� ����Ǹ� ������ �Ҹ��Ѵ�.
		int a = 100;
		System.out.println("a :"+ a );
		System.out.println("b :"+ b );
	}
	public void fun() {
		//fun �޼��� �ȿ� a������ ���ǵ��� �ʾƼ� ȣ�� �Ұ�
//		System.out.println("a: "+ a);//a�Ҹ�Ǿ� ȣ�� �Ұ���
		System.out.println("b: "+ b);//b�� ������� �̱� ������ ȣ�Ⱑ��
	}
	
	public static void main(String[] args) {
		for(int i =1;i<=5;i++) { //�̶� int i�� ��� ���ȿ����� ��������
			System.out.println(i+"\t");
		}
		System.out.println("\n=================");
		//main�� �ȿ� i ������ ��� ȣ�� ����
//		System.out.println(i+"\t");//i�� �̹� �Ҹ�Ǽ� ȣ�� �Ұ�
		
		int a;//��� �����̾ƴ϶� main�� �ȿ��� ����
		for (a=1;a<=5;a++) {
			System.out.println(a+"\t");
		}
		System.out.println();//�ܼ� �ٹٲ�
		System.out.println(a);//�ݺ����� ����Ǿ main�� �ȿ��� �����Ǿ��� ������ ȣ�Ⱑ��
	}
}
