package kr.s01.member;

class Outer2{
	private int x = 100;
	//�������Ŭ����
	class Inner2{
		private int y = 200; //Inner2���� ��������� ����� �����ִ� x�� �����پ���
		public void make() {
			System.out.println("x= "+ x);
			System.out.println("y= "+ y);//���������ڸ� �ᵵ �ٸ�Ŭ������ ����⶧���� �����Ҽ��ְ����ش� ��ġ ����Ŭ�������ִ°�ó��
		}
	}
}
public class MemberMain02 {
	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		Outer2.Inner2 oi = ot.new Inner2();
		oi.make();
	}
}
