package kr.s01.extention;

//�θ� Ŭ����
class People{
	public void eat() {
		System.out.println("�Ļ��ϴ�.");
	}
}
//�ڽ� Ŭ����
class Student extends People{
	public void study() {
		System.out.println("�����ϴ�.");
	}
}
public class ExtentionMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();//People�� �޼��带 ��� �޾Ƽ� ȣ��
		s.study();//Student�� �޼���
		System.out.println(s.toString());//Object�� �޼��带 ��� �޾Ƽ� ȣ�� //���� �������� this ���� �������� ����tt.toString �ε� tt�� �ᵵ �ڵ������� ���������´� ( kr.04.thistest )
		System.out.println(s);//toString�Ƚᵵ �ڵ������� ���������´�.
		
		
	}
}
