package kr.s11.inter;

interface A1{
	//상수
	public static final int W = 10;//원래 형태 
	int X = 20;// public static final를 생략한거라 ★변수아니라 상수
	static int Y = 30; //public final 생략
	final int Z = 40; //public static생략
	//호출만하면 스태틱영역에 메모리에 올라간다
	//static은 클래스가 아니라서 인터페이스는 단독으로 사용할수없어서 객체생성 불가능
}

public class InterMain01 {
	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가능
		//A1 ap = new A1();
		
		//static 상수이기 때문에 인터페이스명.상수명 형식으로 호출함
		System.out.println("W = "+A1.W);
		System.out.println("X = "+A1.X);
		System.out.println("Y = "+A1.Y);
		System.out.println("Z = "+A1.Z);
		
		
	}
}
