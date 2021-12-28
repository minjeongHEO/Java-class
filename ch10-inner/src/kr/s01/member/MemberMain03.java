package kr.s01.member;

class Outer3{
	//멤버변수
	int value = 10;
	//멤버내부클래스
	class Inner3{
		int value = 20;//이름을 일부러 똑같이 설정해봄
		public void method1(){
			int value = 30;
			System.out.println("지역변수 value : " + value);
			System.out.println("inner3의 멤버변수 value : " + this.value);
			System.out.println("Outer3의 멤버변수 value : " + Outer3.this.value);
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
