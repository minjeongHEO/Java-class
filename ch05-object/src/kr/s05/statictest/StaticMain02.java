package kr.s05.statictest;

public class StaticMain02 {
	
	int a;// 인스턴스 변수
	static String s; //스태틱변수(클래스변수)
	public static void main(String[] args) {
//		a = 10; //오류>인스턴스변수는 반드시 객체 생성 이후에 호출해야 오류안난다.
		
//		StaticMain02.s = "자바의 꿈"; //static은 앞에 클래스명을 붙여서 호출 , 객체 생성 없이호출만 했음에도 실행가능
		s = "자바의 꿈";//main과 s가 같은 클래스 내에있기 때문에 앞에 클래스명 생략 가능하다
		System.out.println("s = "+ StaticMain02.s);
		
	}
}
