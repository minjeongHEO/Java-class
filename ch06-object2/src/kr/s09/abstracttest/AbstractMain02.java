package kr.s09.abstracttest;

//추상클래스
//일반적으로 한 개 이상의 추상메서드를 갖고 있음
//추상메서드가 없을수도있는데 별 의미가 없다
abstract class A2{
	//추상메서드 abstract붙이고중괄호로 닫지않고 ;
	//일반클래스에서는 추상메서드 만들수없다.
	public abstract void getA();
	//일반메서드
	public void make() {
		System.out.println("make 메서드");
	}
}
//추상클래스를 상속받으면 추상클래스가 가지고 있는 추상메서드를
//자식클래스에 반드시 구현해야한다
class B2 extends A2{
	//부모클래스의 추상메서드 반드시 구현
	@Override
	public void getA() {
		System.out.println("getA 메서드");
	}
	
}
public class AbstractMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.make();
		bp.getA();
	}

}
