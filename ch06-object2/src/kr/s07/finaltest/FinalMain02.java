package kr.s07.finaltest;

class FinalMe{
	int var = 100;
	
	//1. 메서드에 final을 지정하면 자식클래스에서 메서드 오버라이딩을 할 수없다.
	public final void setVar(int var) {
		this.var = var;
	}
}
public class FinalMain02 extends FinalMe{
	
//상속은 되지만 오버라이딩으로의 확장은 안됀다
//	@Override
//	public void setVar(int var) {
//		System.out.println(var);
//	}

	
	public static void main(String[] args) {
		FinalMe fm = new FinalMe();
		fm.setVar(300);
		System.out.println(fm.var);
	}
}
