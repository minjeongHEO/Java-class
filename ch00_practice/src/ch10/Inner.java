package ch10;

class Outer2{
	private int x = 100;
	//�������Ŭ����
	class Inner2{
		private int y = 200; //�̳������� ��������� ����� �����մ��� ������ �����ٝ���
		public void make() {
			System.out.println("x= "+ x);
			System.out.println("y= "+ y);//���������ڸ� �ᵵ �ٸ�Ŭ������ ����⶧���� �����Ҽ��ְ����ش� ��ġ ����Ŭ�������ִ°�ó��
		}
	}
}
public class MemberMain02 {
	public static void main(String[] args) {
		Outer2 otr = new Outer2();
		
		Outer2.Inner2 inr = ot.new Inner2();
		oi.make();
	}
}