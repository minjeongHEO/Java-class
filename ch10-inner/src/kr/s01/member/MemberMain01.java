package kr.s01.member;

class Outer{
	int x = 100;
	//�������Ŭ����
	class Inner{
		int y = 200;
	}
}
public class MemberMain01 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		System.out.println("x= "+ ot.x);
		System.out.println("---------------");
		//�������Ŭ���� ��ü ����
		//����Ŭ������ �ڷ���
		Outer.Inner oi = ot.new Inner();
		System.out.println(oi);
		System.out.println("y= "+oi.y);
		
	}

}
