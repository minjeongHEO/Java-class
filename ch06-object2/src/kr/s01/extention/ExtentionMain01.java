package kr.s01.extention;

//�θ�Ŭ���� =superŬ����
//class Parents extends Object{ //�⺻������ ����, �ڵ������� object�� ��ӵ�(���������, �ȹ���������)
class Parents{
	int a = 100;
	int b = 200;
}
//�ڽ�Ŭ����
class Child extends Parents{
	
}
public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}
