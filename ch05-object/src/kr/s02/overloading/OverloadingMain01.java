package kr.s02.overloading;

public class OverloadingMain01 {
	/*
	 * Method Overloading(중복정의)는 하나의 클래스 내에서 같은 이름을 가지는 메서드가
	 * 여러 개 정의되는 것을 말한다. 
	 * 메서드를 구별해주는 요소로 인자의 타입, 갯수, 배치된 순서를 이용하고
	 * 다를 경우에 다른 메서드로 인식한다.
	 */
	
	public void print(int n) {
		System.out.println("정수 n = " + n);
	}
//	public void print(int a) { //메소드이름이 중복되어 충돌이 나면 1.인자의 자료형을 본다 2.인자의 개수를 본다
//		System.out.println("정수 a = " + a);
//	}
	public void print(double a) { //메소드이름이 중복되어 충돌이 나면 1.인자의 자료형을 본다 2.인자의 개수를 본다
		System.out.println("정수 a = " + a);
	}
	public void print(double n, long a) {
		System.out.println("실수 n ="+ n + ",정수 a =" + a);
	}
	public void print(long a, double n) {
		System.out.println("정수 a ="+ a + ",실수 n =" + n);
	}

	public static void main(String[] args) {
		OverloadingMain01 ot = new OverloadingMain01();
		ot.print(20); //타입이 int 이므로 n으로 간다
		ot.print(5.6); //타입이 double이므로 a로 간다
		ot.print(5.6, 1234L); //타입이 두개
		ot.print(1000L, 5.8); //타입이 두개와 순서
		
		
	}
}
