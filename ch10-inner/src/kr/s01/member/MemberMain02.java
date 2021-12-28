package kr.s01.member;

class Outer2{
	private int x = 100;
	//멤버내부클래스
	class Inner2{
		private int y = 200; //Inner2에서 멤버변수를 만들고 위에있는 x를 가져다쓴다
		public void make() {
			System.out.println("x= "+ x);
			System.out.println("y= "+ y);//접근지정자를 써도 다른클래슨데 멤버기때문에 접근할수있게해준다 마치 같은클래스에있는것처럼
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
