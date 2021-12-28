package kr.s11.inter;

interface A2{
	//추상메서드
	public abstract void getA();//원형
	void getB(); //접근지정자가default가 아니라 public abstract이 생략
}
//메모리에 올릴수가없다 -> 일반클래스에 부연(적용)해서 사용한다.

//인터페이스를 클래스에 구현
class B2 implements A2{ //A2를 B2에 구현하겠다
	//추상메서드가 호출되지않도록 구현을 해줘야 에러가 안난다. 인터페이스의 추상메서드를 구현
	@Override
	public void getA() {
		System.out.println("getA 메서드");
	}
	@Override
	public void  getB() {
		System.out.println("getB 메서드");
	}
}

public class InterMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.getA();
		bp.getB();
	}

}
/*추상클래스와 인터페이스의 차이
 * 추상클래스는 일반메서드 변수 넣을수가있지만
 * 인터페이스는 클래스가 아니고 상수아니면 추상메서드만 넣을수있다,
 */
