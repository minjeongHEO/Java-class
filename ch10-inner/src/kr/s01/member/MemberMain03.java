package kr.s01.member;

class Outer3{
	//�������
	int value = 10;
	//�������Ŭ����
	class Inner3{
		int value = 20;//�̸��� �Ϻη� �Ȱ��� �����غ�
		public void method1(){
			int value = 30;
			System.out.println("�������� value : " + value);
			System.out.println("inner3�� ������� value : " + this.value);
			System.out.println("Outer3�� ������� value : " + Outer3.this.value);
		}
	}
}
public class MemberMain03 {
	public static void main(String[] args) {
		Outer3 ot = new Outer3();
		Outer3.Inner3 oi = ot.new Inner3();
		oi.method1();
	}
}
