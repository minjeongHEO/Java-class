package kr.s04.anony;
//부모클래스(일반클래스)
class Inner6{
	int y = 200;
	public void disp() {
		System.out.println("Inner6의 disp 메서드");
	}
}

public class AnonyMain01 {

	public void fun() {
		//로컬내부클래스
		class InnerTest extends Inner6{
			int x = 300;
			public void make() {
				System.out.println("make메서드");
			}
			@Override
			public void disp() {
				System.out.println("InnerTest의 disp메서드");
			}
		}
		//로컬내부클래스 생성
		InnerTest i = new InnerTest();
		System.out.println(i.y);
		System.out.println(i.x);
		i.make();
		i.disp();
		System.out.println("----------------------------");
		Inner6 in = i;//자식클래스타입에서 부모클래스타입으로 형변환
		System.out.println(in.y);
		in.disp();
//		System.out.println(in.x);
//		in.make();//자식클래스에있는건 호출이 안됌
	}

	public static void main(String[] args) {
		AnonyMain01 an = new AnonyMain01();
		an.fun();
	}
}
