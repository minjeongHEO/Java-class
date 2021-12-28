package kr.s06.animal;

public class AnimalMain {
	public static void main(String[] args) {
		//�⺻ �����ڸ� �̿��ؼ� ��ü ����
		Animal a1 = new Animal(); //����Ʈ������
		
		//�⺻ ���� ����
		a1.setName("�⸰");
		a1.setAge(10);
		a1.setFly(false);
		
		
		//���� ���
		System.out.println("�̸� : "+ a1.getName());//�ٸ޼ҵ带�̿�
		System.out.println("���� : "+ a1.getAge());//�ٸ޼ҵ带�̿�
		System.out.println("���� ���� : "+ a1.isFly());//�Ҹ�����is���δ�
//		System.out.println("���� ���� : "+ (a1.isFly() ? "����" : "�Ұ���") );
		System.out.println("���� ���� : "+ printFly(a1.isFly()));//�Ҹ�����is���δ�
		System.out.println("-----------------------");
		
		//�����ڷ� ������ ����
		Animal a2 = new Animal("�ⷯ��",3,true);//�⺻������ ������ �ʿ䰡 ���� 9~11����
		//���� ���
		System.out.println("�̸� : "+ a2.getName());
		System.out.println("���� : "+ a2.getAge());
		System.out.println("���� ���� : "+ a2.isFly());
		System.out.println("���� ���� : "+ (a2.isFly() ? "����" : "�Ұ���") );
		System.out.println("���� ���� : "+ printFly(a2.isFly()));//����Ŭ�����̹Ƿ� �ҷ��Ë� Ŭ����������Ѱ�
		
	}
	//�޼��忡���� private���������� ���ϼ��ֵ�
	private static String printFly(boolean fly){ //main���� �����ص� �������
		//static�� �޼��� ȣ��θ� ����
		return fly ? "����" : "�Ұ���"; 
	}
}
