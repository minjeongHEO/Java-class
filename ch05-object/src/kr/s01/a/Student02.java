package kr.s01.a;
public class Student02 {
	
	//�ʵ�
	//�������(��ü �������� �� ����)
	String name;
	int age;
	String hobby;
	
	public static void main(String[] args) {
		//��ü�� ���� �� ����
		Student02 student = new Student02();
		student.name = "ȫ�浿";
		student.age = 20;
		student.hobby = "�౸";
		
		System.out.println(student.name + "," + student.age+ ","+ student.hobby);
		System.out.println("-----------------------");
		
		Student02 student2 = new Student02();//�������� �ٸ��� �ؼ� ��ü�� ������ ���� �����ϴ� �ּҴ� �ٸ���.
		
		student2.name =  "�ڹ���";
		student2.age = 45;
		student2.hobby = "�߱�";
		System.out.println(student2.name + "," + student2.age+ ","+ student2.hobby);
				
				
		
	}
}
