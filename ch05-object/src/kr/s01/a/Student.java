package kr.s01.a;
public class Student {
	
	//�ʵ� (�������)
	String name;
	int age;
	
	public static void main(String[] args) {
		//��ü ����
		Student s;
		//��ü ���� newŬ������();
		s = new Student();// student��ü�� �޸��� ���̶�� ���� ��������� s�� ��ü�� ����Ų��
		//��ü�� �ʵ��� �⺻���� ���
		System.out.println(s.name + ","+s.age);
		System.out.println("----------------");
		
		//��ü�� �ʵ忡 ������ ���� //�ʵ�� ������ ����� ����
		s.name="ȫ�浿";
		s.age=20;
		
		//��ü�� �ʵ忡 ����� ������ �б�
		System.out.println(s.name+","+s.age);
		
		
	}
}
