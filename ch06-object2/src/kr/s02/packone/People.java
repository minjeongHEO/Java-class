package kr.s02.packone;

public class People {
	//private:같은 클래스에서만 호출 가능
	private int a =  10;
	
	//default:같은 패키지에서만 호출 가능
	int b = 20;
	
	//protected:같은 패키지에서 호출가능, 다른 패키지에서도 상속관계이면 호출 가능
	protected int c;
	
	//public:접근 제한이 없음
	public int d = 40;
	

}
