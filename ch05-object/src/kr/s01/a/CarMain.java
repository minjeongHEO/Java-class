package kr.s01.a;
class Car{ //�� Ŭ���� ������ public �� �� ����,//�������Ͽ��� ��õǾ��ְ� bin��ο� ���� ���� Ŭ������ ��������ִ�
	//�������
	String company = "�����ڵ���";
	String model = "���̿���5";
	String color = "����";
	int maxSpeed = 350;
	int speed;
//	int korean, english, math; //��ü���� ����Ҷ��� �ѹ��� �����ϴ� ����� �ᵵ ������ ������ ���� �󵵰� ����
}
public class CarMain { //�� Ŭ����
	public static void main(String[] args) {
		//��ü ���� �� ����
		Car myCar = new Car();
		
		//��ü�� ��� ������ ����� ������ �б�
		System.out.println("���� ȸ��: "+ myCar.company);
		System.out.println("�𵨸� : "+ myCar.model);
		System.out.println("���� : "+ myCar.color);
		System.out.println("�ְ� �ӵ� : "+ myCar.maxSpeed);
		
		System.out.println("���� �ӵ� : "+ myCar.speed);// ��ü�� �������ǰ� �ʱ�ȭ�� �ȵ� speed�� 0���� �⺻������ �ʱ�ȭ�Ǿ��ִ�.
													 // �ڷ� 29������ �⺻�ڷ��� ����
		
		//��������� �� ����
		myCar.speed =  60;
		System.out.println("������ �ӵ� : "+myCar.speed);
		
	}
}
