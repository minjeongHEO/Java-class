package kr.s01.a;
public class Student03 {
	//�ʵ�
	//��� ����
	String name;
	int korean;
	int english;
	int math;
	int sum;
	double avg;
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		Student03 student = new Student03();
		//��ü�� �ʵ忡 �����͸� ����
		student.name = "ȫ�浿";
		student.korean = 98;
		student.english = 97;
		student.math = 95;
		student.sum = student.korean + student.english + student.math;
		student.avg = student.sum/3.0;
		
		//��ü�� �ʵ忡 ����� ������ �б�
		System.out.println("�̸� : "+student.name);
		System.out.println("���� : "+student.korean);
		System.out.println("���� : "+student.english);
		System.out.println("���� : "+student.math);
		System.out.println("���� : "+student.sum);
		System.out.printf("��� : %.2f ", student.avg);
		
		
	}
}
