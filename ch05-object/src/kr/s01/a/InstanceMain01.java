package kr.s01.a;
public class InstanceMain01 {
	//Ŭ������ �⺻ ����
	//�ʵ�
	int var1; //�������
	String var2;//�������

	//������
	public InstanceMain01 () {} //�����ڴ� �ʼ� �ƴϰ� ��������
	
	//����޼���
	public int sum(int a, int b) {
		return a+b;
	}
	
	//��ü�� �����ϸ� ���~��� �����ִ°� ����.(�����ڴ� �����ʴ´�. ��ü�� �����Ҽ��ֵ��� �����ϴ¿���)
	public static void main(String[] args) {
		//��ü ����
		InstanceMain01 me; //me=�������� �ּҰ�, �ּҰ� ����
		//��ü ����
		me =  new InstanceMain01();//Ŭ���� ��� �����ϰ� ���� �����ڸ� ȣ��
		
		//��ü�� ��������� ������ ����(�ʱ�ȭ)
		me.var1 = 10;
		me.var2 = "����";
		//��ü�� ��������� ����� ������ �б�
		System.out.println(me.var1+","+me.var2);
		
		//��ü�� ����޼��忡 ������ �����ϰ� ������� ������ ����
		int result = me.sum(10, 20);
		System.out.println("result = "+ result);
	}
}
