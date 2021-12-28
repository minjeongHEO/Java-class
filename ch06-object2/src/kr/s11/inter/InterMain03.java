package kr.s11.inter;

interface Inter1{
	//추상메서드
	public abstract int getA();
}

interface Inter2{
	//추상메서드
	public abstract int getB();
}


//Inter1과 Inter2가 Inter3에 상속
interface Inter3 extends Inter1,Inter2{
//	public abstract int getA();가 없어도 상속관계에있어서 있다고 친다
	//추상메서드
	public abstract int getData();
}

interface Inter4{
	//추상메서드
	public abstract String getStr();
}

//일반클래스에 Inter3를 구현해보자
class InterSub implements Inter3,Inter4{//,로 추가해서 상속할수도있다.
	//추상메서드를 구현안해서 클래스명에 에러가 뜬다
	//상속받아서 세개의 메소드를 전부 구현해줘야한다
	@Override 
	public int getA() {
		return 10;
	}
	@Override 
	public int getB() {
		return 20;
	}
	@Override 
	public int getData() {
		return 30;
	}
	//Inter4의 추상메서드 구현
	@Override 
	public String getStr() {
		return "추가";
	}
}

public class InterMain03 {
	public static void main(String[] args) {
		InterSub is = new InterSub();
		System.out.println(is.getA());
		System.out.println(is.getB());
		System.out.println(is.getData());
		System.out.println(is.getStr());
	}

}
