package kr.s09.abstracttest;
abstract class AbxEx1{
	int a = 100;
	int b = 200;
	final String STR = "abstract test";//상수: 숫자를 많이쓰지만 문자도 쓸 수있다
	//일반메서드
	public String getStr() {
		return STR;
	}
	//추상메서드
	abstract public int getA();
	public abstract int getB();//접근지정자와 abstract위치는 바껴도 상관없다
}
//추상클래스에 추상클래스 상속
abstract class AbxEx2 extends AbxEx1{
	String msg = "신세계";
	//추상메서드 구현
	@Override
	public int getA() {
		return a;
	}
	//추상메서드
	public abstract String getMsg();
}
public class AbstractMain03 extends AbxEx2{
	//추상메서드 구현
	@Override
	public int getB() {
		return b;
	}
	@Override
	public String getMsg() {
		return msg;
	}
	public static void main(String[] args) {
		AbstractMain03 ab = new AbstractMain03();
		System.out.println(ab.getB());
		System.out.println(ab.getMsg());

	}


}
