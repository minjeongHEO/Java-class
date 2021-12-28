package kr.s03.statictest;

public class InnerMain {
	
	//내부클래스
	public static class StaticInner{
		//내부클래스안에 static 변수(또는 메서드)가 정의되어 있는경우 내부클래스에 반드시 static내부클래스로 정의해야한다.
//		내부클래스에 스태틱이 명시되어있으면 바로 스태틱메인만 생성한다 이너메인객체를 생성하지않고
		int iv = 200;
		static int cv = 300;
		public void fun() {
			System.out.println("fun 메서드");
		}
		public static void make() {
			System.out.println("make 스태틱 메서드");
		}
	}
	
	public static void main(String[] args) {
		//static은 객체생성하는게 아니기 때문에 포함관계만 명시하면 호출이 가능
		System.out.println(InnerMain.StaticInner.cv);
		InnerMain.StaticInner.make();
		
//		내부클래스에 스태틱이 명시되어있으면 바로 스태틱메인만 생성한다 이너메인객체를 생성하지않고
		//스태틱 내부클래스는 스태틱내부클래스만 단독으로 객체 생성해서 사용함

		InnerMain.StaticInner is = new InnerMain.StaticInner();
		System.out.println(is.iv);
		is.fun();
		
		
	}
}
